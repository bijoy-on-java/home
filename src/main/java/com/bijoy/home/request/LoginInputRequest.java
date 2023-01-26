package com.bijoy.home.request;

import lombok.Getter;
import lombok.Setter;

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
