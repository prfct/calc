package com.calc.junit.service.validator;

import com.calc.junit.domain.ComplexObject;

public interface CalculatorParamsValidator {
    void validate(ComplexObject param1, ComplexObject param2);
}
