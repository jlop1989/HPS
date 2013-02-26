package model.calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.operator.binaryOperator.BinaryOperator;

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
        if (o2 == 0.0) {
            throw new DivisionByZeroException();
        }
        return o1 / o2;
    }

    public Double div(Double o1, Integer o2) {
        if (o2 == 0) {
            throw new DivisionByZeroException();
        }
        return o1 / o2;
    }

    public Integer div(Integer o1, Integer o2) {
        if (o2 == 0) {
            throw new DivisionByZeroException();
        }
        return o1 / o2;
    }

    public Double div(Integer o1, Double o2) {
        if (o2 == 0.0) {
            throw new DivisionByZeroException();
        }
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

    public Object calculate(String operation, Object arg1, Object arg2) {
        try {        
            Method m = this.getClass().getMethod(operation, new Class<?>[]{arg1.getClass(), arg2.getClass()});
            return m.invoke(this, new Object[]{arg1, arg2});
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException ex) {
            Logger.getLogger(NumberCalculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            if( ex.getTargetException() instanceof DivisionByZeroException)
                throw new DivisionByZeroException();
        }
        return null;
    }
}
