package com.bijoy.home.controller;

import com.bijoy.home.request.SavingInputRequet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * My app login controller. This class will get called when a user logged in/ out of the
 * application.
 *
 * Date: Saturday January 28, 2022 07:30 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */
@RestController
@RequestMapping("/finance")
public class MyAssetController {

    private static Logger LOGGER = LoggerFactory.getLogger(MyAssetController.class);
    @Autowired
    private ObjectMapper myAssetControllerObjectMapper;
    @PostMapping(path = "/calculate/net", produces = "application/json", consumes = "application/json")
    public ResponseEntity<String> calculateTotalAsset(@RequestBody SavingInputRequet savingInputRequet) throws JsonProcessingException {
        LOGGER.info("Inside MyAssetController.calculateTotalAsset method.");
        if(savingInputRequet.getIciciBankNetAmount() == BigDecimal.ZERO || savingInputRequet.getHdfcBankNetAmount() == BigDecimal.ZERO || savingInputRequet.getAxisBankNetAmount() == BigDecimal.ZERO ||
        savingInputRequet.getSbiBankNetAmount() == BigDecimal.ZERO || savingInputRequet.getLicInsuranceAmount() == BigDecimal.ZERO || savingInputRequet.getCommBankNetAmount() == BigDecimal.ZERO ||
        savingInputRequet.getNabBankNetAmount() == BigDecimal.ZERO || savingInputRequet.getWestpacBankNetAmount() == BigDecimal.ZERO || savingInputRequet.getCareSuperNetAmount() == BigDecimal.ZERO) {
         return new ResponseEntity<>("Please provide net savings for each account", HttpStatus.BAD_REQUEST);
        }
        List<BigDecimal> netAssetList = new ArrayList<>();
        netAssetList.add(savingInputRequet.getIciciBankNetAmount());
        netAssetList.add(savingInputRequet.getHdfcBankNetAmount());
        netAssetList.add(savingInputRequet.getAxisBankNetAmount());
        netAssetList.add(savingInputRequet.getSbiBankNetAmount());
        netAssetList.add(savingInputRequet.getLicInsuranceAmount());
        netAssetList.add(savingInputRequet.getCommBankNetAmount());
        netAssetList.add(savingInputRequet.getNabBankNetAmount());
        netAssetList.add(savingInputRequet.getWestpacBankNetAmount());
        netAssetList.add(savingInputRequet.getCareSuperNetAmount());
        return new ResponseEntity<>(myAssetControllerObjectMapper.writeValueAsString("Total Asset: " +netAssetList.stream().reduce(BigDecimal.ZERO, BigDecimal::add)), HttpStatus.OK);
    }


}
