package com.calc.junit.service.validator;

import com.calc.junit.domain.ComplexObject;
import org.junit.Test;

public class SecondValidationServiceImplTest {

    private ComplexObjectValidator complexObjectValidator = new SecondValidationServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void validateFailed() throws Exception {
        ComplexObject complexObject = new ComplexObject(0, 1);

        complexObjectValidator.validate(complexObject);

    }

    @Test
    public void validateSuccess() {
        ComplexObject complexObject = new ComplexObject(1, 1);

        complexObjectValidator.validate(complexObject);
    }
}