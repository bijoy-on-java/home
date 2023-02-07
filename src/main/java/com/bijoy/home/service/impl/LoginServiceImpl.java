package com.bijoy.home.service.impl;

import com.bijoy.home.entity.LoginUser;
import com.bijoy.home.repository.LoginRepository;
import com.bijoy.home.request.LoginInputRequest;
import com.bijoy.home.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * My app login Service implementation. This interface will get called when a user logged in/ out of the
 * application.
 *
 * Date: Tuesday February 07, 2023 10:49 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginRepository loginRepository;
    @Override
    public LoginUser getLoginUser(LoginInputRequest loginInputRequest) {
        LoginUser loginUser = loginRepository.fetchLoginUser(loginInputRequest);
        return loginUser;
    }
}
