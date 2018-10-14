package com.okeydokey.oauth2study.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
