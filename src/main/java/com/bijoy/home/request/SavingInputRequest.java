package com.bijoy.home.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Money savings request POJO
 *
 * Date: Tuesday February 07, 2023 10:49 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */

public class SavingInputRequest extends Request {

    @Getter
    @Setter
    private BigDecimal iciciBankNetAmount;
    @Getter
    @Setter
    private BigDecimal hdfcBankNetAmount;
    @Getter
    @Setter
    private BigDecimal axisBankNetAmount;
    @Getter
    @Setter
    private BigDecimal sbiBankNetAmount;
    @Getter
    @Setter
    private BigDecimal licInsuranceAmount;
    @Getter
    @Setter
    private BigDecimal commBankNetAmount;
    @Getter
    @Setter
    private BigDecimal nabBankNetAmount;
    @Getter
    @Setter
    private BigDecimal westpacBankNetAmount;
    @Getter
    @Setter
    private BigDecimal careSuperNetAmount;

    public SavingInputRequest() {
        //Avoid instantiation
    }

    public SavingInputRequest(BigDecimal iciciBankNetAmount, BigDecimal hdfcBankNetAmount, BigDecimal axisBankNetAmount, BigDecimal sbiBankNetAmount, BigDecimal licInsuranceAmount,
                              BigDecimal commBankNetAmount, BigDecimal nabBankNetAmount, BigDecimal westpacBankNetAmount, BigDecimal careSuperNetAmount) {
        this.iciciBankNetAmount = iciciBankNetAmount;
        this.hdfcBankNetAmount = hdfcBankNetAmount;
        this.axisBankNetAmount = axisBankNetAmount;
        this.sbiBankNetAmount = sbiBankNetAmount;
        this.licInsuranceAmount = licInsuranceAmount;
        this.commBankNetAmount = commBankNetAmount;
        this.nabBankNetAmount = nabBankNetAmount;
        this.westpacBankNetAmount = westpacBankNetAmount;
        this.careSuperNetAmount = careSuperNetAmount;
    }
}
