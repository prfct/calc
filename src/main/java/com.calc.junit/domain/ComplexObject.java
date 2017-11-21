package com.calc.junit.domain;

public class ComplexObject {

    private int valueA;
    private int valueB;
    private Service service;

    public ComplexObject() {
    }

    public ComplexObject(int valueA, int valueB, Service service) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.service = service;
    }

    public ComplexObject(int valueA, int valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexObject that = (ComplexObject) o;

        if (valueA != that.valueA) return false;
        return valueB == that.valueB;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "valueA=" + valueA +
                ", valueB=" + valueB +
                '}';
    }

}
