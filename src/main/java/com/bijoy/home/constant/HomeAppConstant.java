package com.bijoy.home.constant;

/**
 * My app login constant class store java constants for home app.
 *
 * Date: Sunday February 05, 2023 10:13 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */
public class HomeAppConstant {

    public interface LoginConstant {
        String USERNAME_CANNOT_BE_BLANK = "Username cannot be blank";
        String PASSWORD_CANNOT_BE_BLANK = "Password cannot be blank";
    }

    public interface SQLConstant {
        String FIND_LOGIN_USER = "select * from app_login where user_name='%s' and password='%s'";
    }
}
