package evaluator;

import annotations.OperatorAnnotation;
import calculator.Calculator;
import calculator.CalculatorMethodFinder;
import calculator.DivisionByZeroException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import operator.Operator;

public class CalculatorEvaluator implements Evaluator {

    @Override
    public Object evaluate(Operator operator, Object[] args) {
        try {
            Method m=CalculatorMethodFinder.getMethod(getSignature(operator, args));
            return m.invoke(m.getDeclaringClass().newInstance(),args);   
        }catch (InvocationTargetException ex){
            if (ex.getTargetException() instanceof DivisionByZeroException)
                throw new DivisionByZeroException();
            return null;
        } catch (IllegalArgumentException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CalculatorEvaluator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public String getSignature(Operator operator, Object[] args) {
        String result = operator.getSymbol();
        for (Object arg : args) 
            result += arg.getClass().getSimpleName();
        return result;
    }

}
