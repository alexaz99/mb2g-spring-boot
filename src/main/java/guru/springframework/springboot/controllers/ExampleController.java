package guru.springframework.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * http://localhost:8080
 * http://localhost:8080/actuator
 *
 * When run mvn, before check and set
 JAVA_HOME='C:\Program Files\Java\jdk-11.0.9'
 echo $JAVA_HOME

 mvn dependency:tree
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String, Object> getIndex(){
        Map<String, Object> returnval = new HashMap<>();

        returnval.put("hello", "world");

        return returnval;
    }

}
