package model.calculator;

public class NumberCalculator extends Calculator {

    public Double add(Double o1, Double o2) {
        return o1 + o2;
    }

    public Double add(Double o1, Integer o2) {
        return o1 + o2;
    }

    public Integer add(Integer o1, Integer o2) {
        return o1 + o2;
    }

    public Double add(Integer o1, Double o2) {
        return o1 + o2;
    }

    public Double sub(Double o1, Double o2) {
        return o1 - o2;
    }

    public Double sub(Double o1, Integer o2) {
        return o1 - o2;
    }

    public Integer sub(Integer o1, Integer o2) {
        return o1 - o2;
    }

    public Double sub(Integer o1, Double o2) {
        return o1 - o2;
    }

    public Double mult(Double o1, Double o2) {
        return o1 * o2;
    }

    public Double mult(Double o1, Integer o2) {
        return o1 * o2;
    }

    public Integer mult(Integer o1, Integer o2) {
        return o1 * o2;
    }

    public Double mult(Integer o1, Double o2) {
        return o1 * o2;
    }
    
    public Double div(Double o1, Double o2) {
        if (o2==0) throw new DivisionByZeroException();
        return o1 / o2;
    }

    public Double div(Double o1, Integer o2) {
        if (o2==0) throw new DivisionByZeroException();
        return o1 / o2;
    }

    public Integer div(Integer o1, Integer o2) {
        if (o2==0) throw new DivisionByZeroException();
        return o1 / o2;
    }

    public Double div(Integer o1, Double o2) {
        if (o2==0.0) throw new DivisionByZeroException();
        return o1 / o2;
    }

    public Boolean less(Double o1, Double o2) {
        return o1 < o2;
    }

    public Boolean less(Double o1, Integer o2) {
        return o1 < o2;
    }

    public Boolean less(Integer o1, Double o2) {
        return o1 < o2;
    }

    public Boolean less(Integer o1, Integer o2) {
        return o1 < o2;
    }

    public Double sqrt(Double o) {
        return Math.sqrt(o);
    }

    public Double sqrt(Integer o) {
        return Math.sqrt(o);
    }
}
