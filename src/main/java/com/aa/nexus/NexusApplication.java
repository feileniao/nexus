package com.aa.nexus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NexusApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexusApplication.class, args);
    }

    @RequestMapping("test")
    public String test(){
        return "test";
    }
    @RequestMapping("test2")
    public String test3(){
        return "test3";
    }
    @RequestMapping("feature_one_two")
    public String one(){
        return "feature_one_two";
    }
    @RequestMapping("feature_two_three")
    public String two(){
        return "feature_two";
    }
    @RequestMapping("release_one_two")
    public String release(){
        return "release_one_two";
    }
    @RequestMapping("hotfix_one")
    public String hotfix(){
        return "hotfix_one";
    }
}
