package model.calculator;

public class BooleanCalculator extends Calculator {

    public Boolean and(Boolean o1, Boolean o2) {
        return o1 && o2;
    }

    public Boolean not(Boolean o) {
        return !o;
    }
}
