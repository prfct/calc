package com.calc.junit.service.validator;

import com.calc.junit.domain.ComplexObject;

public class SecondValidationServiceImpl implements ComplexObjectValidator {

    @Override
    public void validate(ComplexObject param) {
        if (param.getValueA() <= 0 || param.getValueB() <= 0) {
            throw new IllegalArgumentException("Param should be greater than 0");
        }

    }
}
