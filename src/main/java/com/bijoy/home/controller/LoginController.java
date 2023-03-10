package com.bijoy.home.controller;

import com.bijoy.home.entity.LoginUser;
import com.bijoy.home.request.LoginInputRequest;
import com.bijoy.home.service.LoginService;
import com.bijoy.home.validator.LoginValidator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * My app login controller. This class will get called when a user logged in/ out of the
 * application.
 *
 * Date: Thursday January 26, 2023 10:53 am
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/login")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private ObjectMapper loginObjectMapper;

    @Autowired
    private LoginService loginService;

    @PostMapping(path = "/app", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> appLogin(@RequestBody LoginInputRequest loginInputRequest) throws JsonProcessingException {
        LOGGER.info("Inside LoginController.appLogin method");
        String inputValidationResponse = LoginValidator.validateLoginInput(loginInputRequest);
        LoginUser loginUser = loginService.getLoginUser(loginInputRequest);
        if(StringUtils.isNotBlank(inputValidationResponse) || loginUser == null) {
            return new ResponseEntity<>(loginObjectMapper.writeValueAsString(inputValidationResponse), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Hooray Successfully logged in!", HttpStatus.OK);
    }
}
