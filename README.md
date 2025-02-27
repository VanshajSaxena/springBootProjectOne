> A really simple Spring Boot Application

---

This project has helped me learn about Spring Annotation Processing. How is
spring bean configuration and specification done using XML format.

### Structure

``` shell
src
├── main
│   ├── java
│   │   └── org
│   │       └── example
│   │           ├── App.java
│   │           ├── bean
│   │           │   └── UserConfig.java
│   │           └── service
│   │               ├── OrderService.java
│   │               └── UserService.java
│   └── resources
│       └── applicationContext.xml
```
### Bean Definition
``` xml
<!-- app/src/main/resources/applicationContext.xml -->
<beans xmlns="http://www.springframework.org/schema/beans"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
  <bean id="userConfig" class="org.example.bean.UserConfig">
    <property name="name" value="Vanshaj Saxena" />
    <property name="className" value="B.Tech." />
  </bean>
  <bean id="userService" class="org.example.service.UserService">
    <constructor-arg ref="userConfig" />
  </bean>
  <bean id="orderService" class="org.example.service.OrderService" factory-method="createInstance">
    <constructor-arg ref="userService" />
    <constructor-arg ref="userConfig" />
  </bean>
</beans>
```
