package com.bijoy.home.repository;

import com.bijoy.home.entity.LoginUser;
import com.bijoy.home.request.LoginInputRequest;

/**
 * My app login Repository interface. This interface will get called when a user logged in/ out of the
 * application. It will make a call to database.
 *
 * Date: Tuesday February 07, 2023 10:49 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */
public interface CustomLoginRepository {
    LoginUser fetchLoginUser(LoginInputRequest loginInputRequest);
}
