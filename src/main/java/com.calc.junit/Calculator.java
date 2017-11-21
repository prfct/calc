package com.calc.junit;

import com.calc.junit.common.Constants;
import com.calc.junit.domain.ComplexObject;
import com.calc.junit.service.CountingService;
import com.calc.junit.service.StatisticService;
import com.calc.junit.service.validator.CalculatorParamsValidator;

public class Calculator {
    private CalculatorParamsValidator calculatorParamsValidator;
    private CountingService countingService;
    private StatisticService statisticService;

    public void setCountingService(CountingService countingService) {
        this.countingService = countingService;
    }

    public void setCalculatorParamsValidator(CalculatorParamsValidator calculatorParamsValidator) {
        this.calculatorParamsValidator = calculatorParamsValidator;
    }

    public void setStatisticService(StatisticService statisticService) {
        this.statisticService = statisticService;
    }

    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        calculatorParamsValidator.validate(param1, param2);
        statisticService.addInvocationMethod(Constants.ADD);
        return countingService.add(param1, param2);
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        calculatorParamsValidator.validate(param1, param2);
        statisticService.addInvocationMethod(Constants.SUBTRACT);
        return countingService.subtract(param1, param2);
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        calculatorParamsValidator.validate(param1, param2);
        statisticService.addInvocationMethod(Constants.MULTIPLY);
        return countingService.multiply(param1, param2);
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        calculatorParamsValidator.validate(param1, param2);
        statisticService.addInvocationMethod(Constants.DIVIDE);
        return countingService.divide(param1, param2);
    }

}
