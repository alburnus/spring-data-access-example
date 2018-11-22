# spring-data-access-example

To run example need:
* you can use postgres DB, but at the moment connection is to H2

After you installed DB, to run an app use command: 
```sql
mvn clean install tomcat7:run
```

* Add @Configuration with: @MapperScan and SqlSessionFactoryBean
* Add interfaces with queries
* Add xml mappers
* You can add configuration in xml
* Add two mybatis dependencies: 
```xml
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis-spring</artifactId>
      <version>1.3.2</version>
    </dependency>
    
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>3.4.6</version>
    </dependency>
```

##LINKS
* http://www.mybatis.org/mybatis-3/configuration.html 
* http://www.mybatis.org/spring/getting-started.html 

##TODO
- add h2 database
- add example: Spring Data, JPQL, Native Query, Named Query, Criteria Builder