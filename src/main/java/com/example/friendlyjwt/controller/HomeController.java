package com.example.friendlyjwt.controller;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/home")
    public String homepage(Authentication authentication){
        var user = authentication.getPrincipal();
        logger.info("Here is the user principle : {}",authentication.getPrincipal());
        logger.info("Here is the user Credentials : {}",authentication.getCredentials());
        logger.info("Here is the user Detail : {}",authentication.getDetails());
        logger.info("Here is the user Authorities : {}",authentication.getAuthorities());
//        log.debug("Here is the user principle : {}",user);
        return ("Hello "+authentication.getName());
    }
}
