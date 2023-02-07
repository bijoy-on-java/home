package com.bijoy.home.request;

import lombok.Getter;
import lombok.Setter;

/**
 * Home app Response POJO
 *
 * Date: Tuesday February 07, 2023 10:49 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */

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
