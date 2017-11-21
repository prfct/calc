package com.calc.junit.service.validator;

import com.calc.junit.domain.ComplexObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdValidationServiceImplTest {
    private ComplexObjectValidator complexObjectValidator = new ThirdValidationServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void validateFailed() throws Exception {
        ComplexObject complexObject = new ComplexObject(50, 1);

        complexObjectValidator.validate(complexObject);

    }

    @Test
    public void validateSuccess() {
        ComplexObject complexObject = new ComplexObject(50, -10);

        complexObjectValidator.validate(complexObject);
    }

}