package com.bijoy.home.controller;

import com.bijoy.home.entity.LoginUser;
import com.bijoy.home.repository.LoginRepository;
import com.bijoy.home.request.LoginInputRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * My app login controller. This class will get called when a user logged in/ out of the
 * application.
 *
 * Date: Thursday January 26, 2022 10:53 am
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */

@RestController
@RequestMapping("/login")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private ObjectMapper loginObjectMapper;

    @Autowired
    private LoginRepository loginRepository;

    @PostMapping(path = "/app", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> appLogin(@RequestBody LoginInputRequest loginInputRequest) {
        LOGGER.info("Inside LoginController.appLogin method");
        if(loginInputRequest.getUserName() == null) {
            return new ResponseEntity<>("Username cannot be blank", HttpStatus.BAD_REQUEST);
        } else if (loginInputRequest.getPassword() == null) {
            return new ResponseEntity<>("Password cannot be blank", HttpStatus.BAD_REQUEST);
        }
        List<LoginUser> allUser = loginRepository.findAll();
        return new ResponseEntity<>("Hooray Successfully logged in!", HttpStatus.OK);
    }
}
