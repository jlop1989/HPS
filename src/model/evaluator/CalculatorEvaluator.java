package model.evaluator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.calculator.Calculator;
import model.calculator.OperatorAnnotation;
import model.calculator.calculators.BooleanCalculator;
import model.calculator.calculators.NumberCalculator;
import model.operator.Operator;
public class CalculatorEvaluator implements Evaluator {

    @Override
    public Object evaluate(Operator operator, Object[] args) {
            if (isNumericOperation(args)) {
                try {
                    Method method = getMethod(new NumberCalculator(),operator, args);
                    return method.invoke(new NumberCalculator(), args);
                } catch (IllegalAccessException | IllegalArgumentException 
                        | InvocationTargetException ex) {
                    Logger.getLogger(CalculatorEvaluator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (isBooleanOperation(args)) {
                try {
                    Method method = getMethod(new BooleanCalculator(),operator, args);
                    return method.invoke(new BooleanCalculator(), args);
                } catch (IllegalAccessException | IllegalArgumentException 
                        | InvocationTargetException ex) {
                    Logger.getLogger(CalculatorEvaluator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return null;

    }

    private static boolean isNumericOperation(Object[] args) {
        for(Object obj : args)
            if(!(obj instanceof Double || obj instanceof Integer))
                return false;
        return true;
    }

    private static boolean isBooleanOperation(Object[] args) {
       for(Object obj : args)
            if(!(obj instanceof Boolean))
                return false;
        return true;
    }
    
    public String getMethodSignature(Method method) {
        String result = method.getAnnotation(OperatorAnnotation.class).value();
        for (Class<?> type : method.getParameterTypes())
            result += type.getSimpleName();
        return result;
    }

    public String getSignature(Operator operator, Object[] args) {
        String result = operator.getSymbol();
        for (Object arg : args) 
            result += arg.getClass().getSimpleName();
        return result;
    }

    private Method getMethod(Calculator calculator,Operator operator, Object[] args) {
        for (Method method : calculator.getClass().getMethods()) 
            if (method.isAnnotationPresent(OperatorAnnotation.class)) 
                if (getMethodSignature(method).equals(getSignature(operator, args))) 
                    return method;
        return null;
    }
}
