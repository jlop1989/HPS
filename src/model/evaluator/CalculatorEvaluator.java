package model.evaluator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.calculator.Calculator;
import model.annotations.OperatorAnnotation;
import model.calculator.CalculatorMethodFinder;
import model.calculator.calculators.BooleanCalculator;
import model.calculator.calculators.NumberCalculator;
import model.operator.Operator;
public class CalculatorEvaluator implements Evaluator {

    @Override
    public Object evaluate(Operator operator, Object[] args) {
        try {
            Method m=CalculatorMethodFinder.getMethod(getSignature(operator, args));
            return m.invoke(m.getDeclaringClass().newInstance(),args);                
        } catch (IllegalArgumentException | InvocationTargetException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CalculatorEvaluator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

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
