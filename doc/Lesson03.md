# [Practices](http://elpdtgit/neo.pan/shiro-lesson03-with-jdbc-realm)

## Practice: IDEA + Gradle + Spring Boot DevTools

- IDE: Enable Plugin - Gradle
- BUG: Spring Beans can not be loaded into IoC container properly, you could update one config file under classpath to trigger restart again, then it will be loaded properly.


## Practice: IDEA + Lombok

- IDE: Install Plugin - Lombok
- IDE: Check on `Enable annotation processing`


## Practice: @Configuration & @ConfigurationProperties & @Bean

```java
@Configuration
@ConfigurationProperties(prefix = "somePrefix")
public class SomeConfiguration {

    @Setter
    private String someProperty;

    @Getter
    private List<String> someProperties = new ArrayList();

    public SomeConfiguration() {
        // someProperty and someProperties is null
    }

    @Bean
    public SomeBean someBean() {
        // Initialize beann with someProperty and someProperties
        return bean;
    }

}
```

```java
@Component
@ConfigurationProperties(prefix = "somePrefix")
public class SomeBeanProperties {

    @Setter
    private String someProperty;

    @Getter
    private List<String> someProperties = new ArrayList();

}

@Configuration
public class SomeConfiguration {
    
    @Bean
    public SomeBean someBean(SomeBeanProperties properties) {
        // Initialize beann with properties.someProperty and properties.someProperties
        return bean;
    }

}
```
