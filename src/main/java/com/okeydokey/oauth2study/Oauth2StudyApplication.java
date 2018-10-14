package com.okeydokey.oauth2study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Oauth2StudyApplication {

    @RequestMapping("/unauthenticated")
    public String unauthenticated() {
        return "redirect:/?error=true";
    }

    public static void main(String[] args) {
        SpringApplication.run(Oauth2StudyApplication.class, args);
    }
}
