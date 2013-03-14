package model.calculator.calculators;

import model.calculator.DivisionByZeroException;
import model.calculator.OperatorAnnotation;
import java.lang.reflect.Method;
import model.calculator.Calculator;

public class NumberCalculator extends Calculator {

    @OperatorAnnotation("+")
    public Double addition(Double o1, Double o2) {
        return o1 + o2;
    }

    @OperatorAnnotation("+")
    public Double addition(Double o1, Integer o2) {
        return o1 + o2;
    }

    @OperatorAnnotation("+")
    public Integer addition(Integer o1, Integer o2) {
        return o1 + o2;
    }

    @OperatorAnnotation("+")
    public Double addition(Integer o1, Double o2) {
        return o1 + o2;
    }

    @OperatorAnnotation("-")
    public Double substraction(Double o1, Double o2) {
        return o1 - o2;
    }

    @OperatorAnnotation("-")
    public Double substraction(Double o1, Integer o2) {
        return o1 - o2;
    }

    @OperatorAnnotation("-")
    public Integer substraction(Integer o1, Integer o2) {
        return o1 - o2;
    }

    @OperatorAnnotation("-")
    public Double substraction(Integer o1, Double o2) {
        return o1 - o2;
    }

    @OperatorAnnotation("*")
    public Double mult(Double o1, Double o2) {
        return o1 * o2;
    }

    @OperatorAnnotation("*")
    public Double mult(Double o1, Integer o2) {
        return o1 * o2;
    }

    @OperatorAnnotation("*")
    public Integer mult(Integer o1, Integer o2) {
        return o1 * o2;
    }

    @OperatorAnnotation("*")
    public Double mult(Integer o1, Double o2) {
        return o1 * o2;
    }

    @OperatorAnnotation("/")
    public Double division(Double o1, Double o2) {
        if (o2 == 0.0) {
            throw new DivisionByZeroException();
        }
        return o1 / o2;
    }

    @OperatorAnnotation("/")
    public Double division(Double o1, Integer o2) {
        if (o2 == 0) {
            throw new DivisionByZeroException();
        }
        return o1 / o2;
    }

    @OperatorAnnotation("/")
    public Integer division(Integer o1, Integer o2) {
        if (o2 == 0) {
            throw new DivisionByZeroException();
        }
        return o1 / o2;
    }

    @OperatorAnnotation("/")
    public Double division(Integer o1, Double o2) {
        if (o2 == 0.0) {
            throw new DivisionByZeroException();
        }
        return o1 / o2;
    }

    @OperatorAnnotation("<")
    public Boolean lessThan(Double o1, Double o2) {
        return o1 < o2;
    }

   @OperatorAnnotation("<")
    public Boolean lessThan(Double o1, Integer o2) {
        return o1 < o2;
    }

   @OperatorAnnotation("<")
    public Boolean lessThan(Integer o1, Double o2) {
        return o1 < o2;
    }

   @OperatorAnnotation("<")
    public Boolean lessThan(Integer o1, Integer o2) {
        return o1 < o2;
    }

    public Double sqrt(Double o) {
        return Math.sqrt(o);
    }

    public Double sqrt(Integer o) {
        return Math.sqrt(o);
    }
}