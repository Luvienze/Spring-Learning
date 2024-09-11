# Spring Learning

Hey, I’m learning Spring Boot through the"Spring Boot 3, Spring 6 & Hibernate for Beginners" course on Udemy, taught by Chad Darby. 
In this course, we will dive into various topics including Spring Boot, Maven and dependencies, Actuator, dependency injection, Hibernate, JPA, REST API, REST Security,
Spring Boot MVC, MVC Security, Thymeleaf, advanced Hibernate mappings, AOP, and more. To enhance my Spring knowledge, 
I’ll also be using other resources such as the official Spring website, Baeldung, GeeksforGeeks, and others. I’ll be sharing my knowledge on both GitHub and Medium.

## Spring Actuator
Spring Actuator is used for monitoring Spring Boot applications. By using the /actuator and /actuator/health endpoints, you can monitor the application's status and manage endpoints effectively.
Advantages:
* Increases customer satisfaction.
* Reduces downtime.
* Boosts productivity.
* Improves cybersecurity management.
* Increases the conversion rate.

### Configuration
Through the course I took from Udemy, we used Maven for configuration, so I’ll explain how to use Actuator with Maven.
The first way is to use Spring Initializr. In the dependencies section, search for "Spring Boot Actuator" and add it to your dependencies. That’s how you do it with Initializr.
Another way is to add the dependency manually to the pom.xml:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId> 
</dependency>
```

Once you've added the Actuator dependency, you can configure what information it will provide. Dive into the application.properties file.
```
management.endpoints.web.exposure.include=*
```

*With the wildcard “*”, it will expose all endpoints. You can also expose individual endpoints with a comma-delimited list.*

```
management.info.env.enabled=true
```
*Shows the /info endpoint.*

```
info.app.name=My Super Cool App
info.app.description=A crazy fun app
info.app.version=1.0.0
```
Customizes the info endpoint.*

```
management.endpoints.web.exposure.exclude=info
```

*Excludes specific endpoints.*

### Predefined Endpoints
- **/auditevents** lists security audit-related events such as user logins and logouts. You can filter by principal or type among other fields.
- **/beans returns** all available beans in the BeanFactory. Unlike /auditevents, it doesn’t support filtering.
- **/conditions**, formerly known as /autoconfig, builds a report of conditions around autoconfiguration.
- **/configprops** allows you to fetch all @ConfigurationProperties beans.
- **/env** returns the current environment properties. Additionally, you can retrieve single properties.
- **/flyway** provides details about Flyway database migrations.
- **/health** summarizes the health status of your application.
- **/heapdump** builds and returns a heap dump from the JVM used by your application.
- **/info** returns general information, which might include custom data, build information, or details about the latest commit.
- **/liquibase** behaves like /flyway but is used for Liquibase.
- **/logfile** returns ordinary application logs.
- **/loggers** enables querying and modifying the logging level of your application.
- **/metrics** details metrics of your application, including both generic and custom metrics.
- **/prometheus** returns metrics formatted to work with a Prometheus server.
- **/scheduledtasks** provides details about every scheduled task within your application.
- **/sessions** lists HTTP sessions, provided you are using Spring Session.
- **/shutdown** performs a graceful shutdown of the application.
- **/threaddump** dumps the thread information of the underlying JVM.

