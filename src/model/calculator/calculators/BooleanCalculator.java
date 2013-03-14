package model.calculator.calculators;

import model.calculator.Calculator;
import model.calculator.OperatorAnnotation;

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
