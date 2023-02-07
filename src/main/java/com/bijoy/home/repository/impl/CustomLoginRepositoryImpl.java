package com.bijoy.home.repository.impl;

import com.bijoy.home.constant.HomeAppConstant;
import com.bijoy.home.entity.LoginUser;
import com.bijoy.home.repository.CustomLoginRepository;
import com.bijoy.home.request.LoginInputRequest;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * My app login Repository implementation. This implementation class will get called when a user logged in/ out of the
 * application. It will make a call to Database.
 *
 * Date: Tuesday February 07, 2023 10:49 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */
public class CustomLoginRepositoryImpl implements CustomLoginRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public LoginUser fetchLoginUser(LoginInputRequest loginInputRequest) {
        List<LoginUser> loginUsers = entityManager.createNativeQuery(String.format(HomeAppConstant.SQLConstant.FIND_LOGIN_USER, loginInputRequest.getUserName(),
                        loginInputRequest.getPassword()), LoginUser.class).getResultList();
        return CollectionUtils.isEmpty(loginUsers) ? null : loginUsers.get(0);
    }
}
