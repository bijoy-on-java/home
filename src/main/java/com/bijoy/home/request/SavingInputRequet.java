package com.bijoy.home.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class SavingInputRequet extends Request {

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

    public SavingInputRequet() {
        //Avoid instantiation
    }

    public SavingInputRequet(BigDecimal iciciBankNetAmount, BigDecimal hdfcBankNetAmount, BigDecimal axisBankNetAmount, BigDecimal sbiBankNetAmount, BigDecimal licInsuranceAmount,
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
