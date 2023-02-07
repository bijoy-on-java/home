package com.bijoy.home.request;

import lombok.Getter;
import lombok.Setter;

/**
 * Login request POJO
 *
 * Date: Tuesday February 07, 2023 10:49 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */
public class LoginInputRequest extends Request {
    @Getter
    @Setter
    private String userName;
    @Getter
    @Setter
    private String password;

    public LoginInputRequest() {
        // Avoid instantiation
    }

    public LoginInputRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

}
