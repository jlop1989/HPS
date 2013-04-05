package model.calculator.calculators;

import model.annotations.OperatorAnnotation;
import model.calculator.Calculator;

public class BooleanCalculator extends Calculator {

    @OperatorAnnotation("&&")
    public Boolean and(Boolean o1, Boolean o2) {
        return o1 && o2;
    }
    
    @OperatorAnnotation("||")
    public Boolean or(Boolean o1, Boolean o2) {
        return o1 || o2;
    }

    @OperatorAnnotation("!")
    public Boolean not(Boolean o) {
        return !o;
    }
}
