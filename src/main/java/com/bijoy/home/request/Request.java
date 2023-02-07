package com.bijoy.home.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Home app request POJO
 *
 * Date: Tuesday February 07, 2023 10:49 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */

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
