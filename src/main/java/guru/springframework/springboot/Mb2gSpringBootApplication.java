package guru.springframework.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 http://localhost:8080
 http://localhost:8080/actuator

 When run mvn, before check and set
 JAVA_HOME='C:\Program Files\Java\jdk-11.0.9'
 echo $JAVA_HOME

 mvn dependency:tree

 run spring boot app from maven
 mvn spring-boot:run
 mvn clean package spring-boot:run

 */
@SpringBootApplication
public class Mb2gSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mb2gSpringBootApplication.class, args);
	}

}

