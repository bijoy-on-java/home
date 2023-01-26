package com.bijoy.home.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Request {

    @Getter
    @Setter
    private Date date;

    public Request() {
        //Avoid instantiation
    }

    public Request(Date date) {
        this.date = date;
    }

}
