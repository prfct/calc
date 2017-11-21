package com.calc.junit.service.validator;

import com.calc.junit.domain.ComplexObject;

public class ThirdValidationServiceImpl implements ComplexObjectValidator {

    @Override
    public void validate(ComplexObject param) {
        int valueA = param.getValueA();

        if ((valueA != -100 && valueA != 50) || param.getValueB() >= 0) {
            throw new IllegalArgumentException("A should be equals to -100 or 50,  B should be lower than 0");
        }
    }
}
