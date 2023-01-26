package com.bijoy.home.request;

import lombok.Getter;
import lombok.Setter;

public class Response {

    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private Status status;
    @Getter
    @Setter
    private String message;

    public Response() {
        //Avoid instantiation
    }

    public Response(String code, Status status, String message) {
        this.code =  code;
        this.status = status;
        this.message = message;
    }
}
