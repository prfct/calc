package com.calc.junit.service.impl;

import com.calc.junit.service.StatisticService;

import java.util.HashMap;
import java.util.Map;

public class StatisticServiceImpl implements StatisticService {
    private Map<String, Integer> methodInvocationMap;

    public StatisticServiceImpl(Map<String, Integer> methodInvocationMap) {
        this.methodInvocationMap = new HashMap<>();
    }

    @Override
    public void addInvocationMethod(String method) {
        methodInvocationMap.put(method, methodInvocationMap.getOrDefault(method, 0) + 1);
    }
}
