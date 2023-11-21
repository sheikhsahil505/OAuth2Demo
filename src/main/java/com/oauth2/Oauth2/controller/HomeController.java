package com.oauth2.Oauth2.controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@EnableOAuth2Sso
public class HomeController {
    @GetMapping("/")
    public String welcome(Principal principal){
        String name = principal.getName();
        return "Hello"+name+ "Welcome to my application ";
    }
}
