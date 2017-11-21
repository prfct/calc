package com.calc.junit.service;

import com.calc.junit.domain.ComplexObject;
import com.calc.junit.domain.Service;
import com.calc.junit.service.impl.CountingServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class CountingServiceImplTest {
    private CountingService countingService = new CountingServiceImpl();

    @Test
    public void addSuccessTest() throws Exception {

        //given
        ComplexObject complexObject = new ComplexObject(1, 2, Service.XIAOMI);
        ComplexObject complexObject1 = new ComplexObject(3, 4, Service.XIAOMI);

        //when
        ComplexObject expected = new ComplexObject(4, 6);
        ComplexObject actual = countingService.add(complexObject, complexObject1);

        //then
        Assert.assertEquals(expected, actual);
    }
}
