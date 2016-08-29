# [Integrating Apache Shiro with CAS SSO server](http://shiro.apache.org/cas.html)

The shiro-cas module is made to protect a web application with a Jasig CAS SSO server. It enables a Shiro-enabled application to be a CAS client.

## Basic understanding of the CAS protocol
   
1. If you want to access an application protected by a CAS client and if you are not authenticated in this application, you are redirected by the CAS client to the CAS server login page. A service parameter in the CAS login url defines the application the user wants to login.
```
http://application.examples.com/protected/index.jsp → HTTP 302
→ https://server.cas.com/login?service=http://application.examples.com/shiro-cas
```

2. You fill the login and password and authenticate in CAS server which then redirects the user to the application (the service url) with a service ticket in url. The service ticket is a short-lived one-time-use token redeemable at the CAS server for a user identifier (and optionally, user attributes).
```
https://server.cas.com/login?service=http://application.examples.com/shiro-cas → HTTP 302
→ http://application.examples.com/shiro-cas?ticket=ST-4545454542121-cas
```

3. The application asks directly the CAS server if the service ticket is valid and the CAS server responds by the identity of the authenticated user. Generally, the CAS client forwards the user to the originally called protected page.
```
http://application.examples.com/shiro-cas?ticket=ST-4545454542121-cas → HTTP 302
→ http://application.examples.com/protected/index.jsp
```

## How to configure shiro to work with CAS server ?

### Dependency

You need to add the shiro-cas Maven dependency in your application :
```xml
<dependency>
    <groupId>org.apache.shiro</groupId>
    <artifactId>shiro-cas</artifactId>
    <version>version</version>
</dependency>
```

(version >= 1.2.0).

### CasFilter

You have to define the service url of your application (which has to be declared also in the CAS server). This url will be used to receive CAS service ticket. For example : http://application.examples.com/shiro-cas

In your shiro configuration, you have to define the CasFilter :

```ini
[main]
casFilter = org.apache.shiro.cas.CasFilter
casFilter.failureUrl = /error.jsp
```

(the failure url is called when the service ticket validation fails).

And the url on which it is available :
```ini
[urls]
/shiro-cas = casFilter
```

This way, when the user is redirected to the application service url (/shiro-cas) by the CAS server with a valid service ticket (after authentication), this filter receives the service ticket and creates a CasToken which can be used by the CasRealm.

### CasRealm

The `CasRealm` uses the `CasToken` created by the `CasFilter` to authenticate the user by validating the CAS service ticket against the CAS server.

In your shiro configuration, you have to add the CasRealm :

```ini
[main]
casRealm = org.apache.shiro.cas.CasRealm
casRealm.defaultRoles = ROLE_USER
#casRealm.defaultPermissions
#casRealm.roleAttributeNames
#casRealm.permissionAttributeNames
#casRealm.validationProtocol = SAML
casRealm.casServerUrlPrefix = https://server.cas.com/
casRealm.casService = http://application.examples.com/shiro-cas
The casServerUrlPrefix is the url of the CAS server (for example : https://server.cas.com).
The casService is the application service url, the url on wich the application receives CAS service ticket (for example : http://application.examples.com/shiro-cas).
The validationProcol can be SAML or CAS (default) : attributes and remember me information are only pushed throught the SAML validation procotol (except specific customizations). It depends on the version of the CAS server : SAML protocol can be used with CAS server version >= 3.1.
```

The `casServerUrlPrefix` is the url of the CAS server (for example : https://server.cas.com).

The `casService` is the application service url, the url on wich the application receives CAS service ticket (for example : http://application.examples.com/shiro-cas).

The `validationProcol` can be SAML or CAS (default) : attributes and remember me information are only pushed throught the SAML validation procotol (except specific customizations). It depends on the version of the CAS server : SAML protocol can be used with CAS server version >= 3.1.

The `defaultRoles` is the default roles given to the authenticated user after CAS authentication success.

The `defaultPermissions` is the default permissions given to the authenticated user after CAS authentication success.

The `roleAttributeNames` defines the names of the attributes received from CAS response which define roles to give to the authenticated user (the roles are separated by comas).

The `permissionAttributeNames` defines the names of the attributes received from CAS response which define permissions to give to the authenticated user (the permissions are separated by comas).

### CasSubjectFactory

In CAS server, you can have "remember me" support. This information is pushed through SAML validation or CAS customized validation.

To reflect the CAS-remember me status in Shiro, you have to define a specific `CasSubjectFactory` in your Shiro configuration :

```ini
[main]
casSubjectFactory = org.apache.shiro.cas.CasSubjectFactory
securityManager.subjectFactory = $casSubjectFactory
```

### Security of the application

Finally, you have to define the security of your application.

In your Shiro configuration, you have to protect url with roles (for example) :
```ini
[urls]
/protected/** = roles[ROLE_USER]
/** = anon
```

And the login url if the user is not authenticated is to be defined on the CAS server with the application service url :
```ini
[main]
roles.loginUrl = https://server.cas.com/login?service=http://application.examples.com/shiro-cas
```

This way, if you are not authenticated and try to acces a `/protected/**` url, you are redirected to the CAS server for authentication.

### Complete configuration sample

```ini
[main]
casFilter = org.apache.shiro.cas.CasFilter
casFilter.failureUrl = /error.jsp

casRealm = org.apache.shiro.cas.CasRealm
casRealm.defaultRoles = ROLE_USER
casRealm.casServerUrlPrefix = https://server.cas.com/
casRealm.casService = http://application.examples.com/shiro-cas

casSubjectFactory = org.apache.shiro.cas.CasSubjectFactory
securityManager.subjectFactory = $casSubjectFactory

roles.loginUrl = https://server.cas.com/login?service=http://application.examples.com/shiro-cas

[urls]
/shiro-cas = casFilter
/protected/** = roles[ROLE_USER]
/** = anon
```

## History

Version 1.2.0 : first release of the shiro-cas module.
``
