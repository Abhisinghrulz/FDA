<h2>FDA</h2>

````
DESCRIPTION : FOOD DELIVERY APPLICATION
````

MODULES
1) Restaurant

*   MAVEN

````
1) mvn clean install -DskipTests
2) <packaging>pom</packaging> -> Added in parent pom
3) mvn clean install -DskipTests -s ./mvn_settings.xml
````

* Database
````
Either use below embedded database

<dependency>
   <groupId>de.flapdoodle.embed</groupId>
   <artifactId>de.flapdoodle.embed.mongo</artifactId>
</dependency>

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=fda
spring.data.mongodb.repositories.type=auto
spring.data.mongodb.username=root
spring.data.mongodb.password=root

````

````
git clone <repository_url>
List of all branches
git branch -a
checkout the specific branch
git checkout <name of branch>
````
