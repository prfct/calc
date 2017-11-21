package com.calc.junit.service.validator;

import com.calc.junit.domain.ComplexObject;
import com.calc.junit.domain.Service;

public class ComplexObjectCalculationValidatorImpl implements CalculatorParamsValidator {

    @Override
    public void validate(ComplexObject param1, ComplexObject param2) {
        if (param1 == null || param2 == null) {
            throw new IllegalArgumentException("Parameter shouldn't be null");
        }

        Service firstServiceParam = param1.getService();
        Service secondServiceParam = param2.getService();

        if (firstServiceParam == null || secondServiceParam == null) {
            throw new IllegalArgumentException("Service field shouldn't be null");
        }

        if (firstServiceParam != secondServiceParam) {
            throw new IllegalArgumentException("Objects should have the same service");
        }
        firstServiceParam.getValidationService().validate(param1);
        secondServiceParam.getValidationService().validate(param2);
    }

}
