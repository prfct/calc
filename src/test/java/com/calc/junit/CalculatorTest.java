package com.calc.junit;

import com.calc.junit.common.Constants;
import com.calc.junit.domain.ComplexObject;
import com.calc.junit.domain.Service;
import com.calc.junit.service.CountingService;
import com.calc.junit.service.StatisticService;
import com.calc.junit.service.validator.CalculatorParamsValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private CountingService countingService;

    @Mock
    private StatisticService statisticService;

    @Mock
    private CalculatorParamsValidator calculatorParamsValidator;

    @InjectMocks
    private Calculator calculator;

    @Test
    public void testAddSuccess() throws Exception {
        ComplexObject expected = new ComplexObject(4, 6);
        ComplexObject complexObject = new ComplexObject(1, 2, Service.SAMSUNG);
        ComplexObject complexObject1 = new ComplexObject(3, 4, Service.SAMSUNG);

        doNothing().when(calculatorParamsValidator).validate(any(ComplexObject.class), any(ComplexObject.class));
        when(countingService.add(complexObject, complexObject1)).thenReturn(expected);

        ComplexObject actual = calculator.add(complexObject, complexObject1);

        Assert.assertEquals(expected, actual);
        verify(countingService, atLeastOnce()).add(complexObject, complexObject1);
        verify(statisticService, atLeastOnce()).addInvocationMethod(Constants.ADD);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddUnsuccess() throws Exception {
        doThrow(IllegalArgumentException.class).when(calculatorParamsValidator).validate(anyObject(), anyObject());
        calculator.add(new ComplexObject(), new ComplexObject());
    }

}
