package com.calc.junit.domain;


import com.calc.junit.service.validator.DefaultValidationServiceImpl;
import com.calc.junit.service.validator.SecondValidationServiceImpl;
import com.calc.junit.service.validator.ThirdValidationServiceImpl;
import com.calc.junit.service.validator.ComplexObjectValidator;

public enum Service {
    XIAOMI(new DefaultValidationServiceImpl()),
    SAMSUNG(new SecondValidationServiceImpl()),
    TMOBILE(new ThirdValidationServiceImpl());

    private ComplexObjectValidator validationService;

    Service(ComplexObjectValidator validationService) {
        this.validationService = validationService;
    }

    public ComplexObjectValidator getValidationService() {
        return validationService;
    }
}
