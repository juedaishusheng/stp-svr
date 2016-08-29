# 盛通印刷：出版服务云平台

## 开发工具

- [Gradle](http://gradle.org/)
- [Spring Initializr](http://start.spring.io/)
- [Spring Boot](http://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Boot v1.3+ - DevTools](http://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-devtools.html)
- [MyBatis Generator](http://www.mybatis.org/generator/)
- [Spock](https://github.com/spockframework/spock)
- [JetBrains Intelli IDEA](https://www.jetbrains.com/idea/)


## 后端选型

- [Apache Shiro | Java Security Framework](http://shiro.apache.org/)
- [Spring 4](http://projects.spring.io/spring-framework/)
- [MyBatis 3](http://www.mybatis.org/mybatis-3/)
- [Thymeleaf](http://www.thymeleaf.org/)


## [前端选型](stp/stp-web)


## 编码规范

- [EditorConfig](http://editorconfig.org/)


## 编码实践

- [Naming](https://google.github.io/styleguide/javaguide.html#s5-naming)

  提示：对于使用IDEA的开发人员：尽量使用IDEA命名提示，就差不多了。

- [Programming Practices](https://google.github.io/styleguide/javaguide.html#s6-programming-practices)

  - 对于重载的方法总是加上`@Override`。
  - 不要捕捉异常，除非你知道怎么处理。


## 关于 Spring Boot DevTools 的 Build/Restart 的不足之处及应对方法

Spring Boot v1.3+ 开始提供, 进入IoC容器的ServiceImpl和Controller的修改会导致Restart时依赖加载失败, 一个办法是失败后修改一下任意一个`classpath`下的配置文件会再次触发Restart, 这样一般来说就会OK了, 再不行就只能退出后重新运行`gradle bootRun`.


## 开发环境

1. hosts
```
192.168.0.151 elpdtgit
192.168.0.152 elpdtman
192.168.0.152 elpdtmvn
```
2. Install Gradle and IDEA (download from [ownCloud](http://elpdtman/owncloud/))
3. Run `git clone -b dev git@elpdtgit:stp/stp-svr.git`
4. Run `gradle idea`
5. Run `open stp-svr.ipr`

### 开发

1. Run `gradle bootRun`
2. Open `http://localhost:9000/`

### 检查

> [FindBugs](https://docs.gradle.org/current/userguide/findbugs_plugin.html)

1. Run `gradle check`
2. Output `build/reports/findbugs`

### 测试

> [Spock Framework](https://github.com/spockframework/spock)

1. Run `gradle test`
2. Output `build/reports/findbugs`

### 打包

1. Run `/war.sh`
2. Output `build/libs/com.el.stp-x.y.z.war`


## 参考资料

- [Effective Java 2](https://raw.githubusercontent.com/andrewpage/programming-ebooks/master/Java/Effective%20Java%20\(2nd%20Edition\).pdf)
- [MyBatis3 FAQ](https://github.com/mybatis/mybatis-3/wiki/FAQ)
