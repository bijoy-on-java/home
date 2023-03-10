package com.bijoy.home.validator;

import com.bijoy.home.request.LoginInputRequest;
import org.apache.commons.lang3.StringUtils;

import static com.bijoy.home.constant.HomeAppConstant.LoginConstant.PASSWORD_CANNOT_BE_BLANK;
import static com.bijoy.home.constant.HomeAppConstant.LoginConstant.USERNAME_CANNOT_BE_BLANK;

/**
 * My app login validator class responsible to validate input data before processing the request.
 *
 * Date: Sunday February 05, 2023 10:05 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */
public class LoginValidator {
    /**
     * Validate username and password input data through login page in Home app.
     *
     * @param loginInputRequest
     * @return String
     */
    public static String validateLoginInput(LoginInputRequest loginInputRequest) {
        if (StringUtils.isBlank(loginInputRequest.getUserName())) {
            return USERNAME_CANNOT_BE_BLANK;
        } else if (StringUtils.isBlank(loginInputRequest.getPassword())) {
            return PASSWORD_CANNOT_BE_BLANK;
        }
        return null;
    }
}
