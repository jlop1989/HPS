package model.calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BooleanCalculator extends Calculator {

    public Boolean and(Boolean o1, Boolean o2) {
        return o1 && o2;
    }

    public Boolean not(Boolean o) {
        return !o;
    }

    public Object calculate(String operation, Object arg1, Object arg2) {
        try {
            Method m = this.getClass().getMethod(operation, new Class<?>[]{arg1.getClass(), arg2.getClass()});
            return m.invoke(this, new Object[]{arg1, arg2});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
        }
        return null;
    }
    
    public Object calculate(String operation, Object arg) {
        try {
                Method m = this.getClass().getMethod(operation, new Class<?>[]{arg.getClass()});
            return m.invoke(this, new Object[]{arg});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
        }
        return null;
    }
}
