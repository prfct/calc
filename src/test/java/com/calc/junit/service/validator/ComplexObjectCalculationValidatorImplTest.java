package com.calc.junit.service.validator;

import com.calc.junit.domain.ComplexObject;
import com.calc.junit.domain.Service;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexObjectCalculationValidatorImplTest {
    private CalculatorParamsValidator calculatorParamsValidator = new ComplexObjectCalculationValidatorImpl();

    @Test(expected = IllegalArgumentException.class)
    public void validateFailedNullParam() throws Exception {
        calculatorParamsValidator.validate(null, new ComplexObject());
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateFailedNullService() throws Exception {
        calculatorParamsValidator.validate(new ComplexObject(), new ComplexObject());
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateFailedWrongServices() throws Exception {
        ComplexObject complexObject = new ComplexObject(1, 1, Service.XIAOMI);
        ComplexObject complexObject1 = new ComplexObject(1, 1, Service.SAMSUNG);
        calculatorParamsValidator.validate(complexObject, complexObject1);
    }

}