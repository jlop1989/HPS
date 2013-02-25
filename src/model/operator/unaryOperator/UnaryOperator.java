package model.operator.unaryOperator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Token;
import model.calculator.BooleanCalculator;
import model.calculator.Calculator;
import model.calculator.NumberCalculator;
import model.operator.Operator;
import model.operator.binaryOperator.BinaryOperator;

public class UnaryOperator extends Operator{
    private Token operand;

    public UnaryOperator(Token operand, String name) {
        super(name);
        this.operand = operand;
    }

    public Token getOperand() {
        return operand;
    }

    @Override
    public Object evaluate() {
        Object op = operand.evaluate();
        Object[] args = {op};
        Class<?>[] parameterTypes = {op.getClass()};
        if (op instanceof Double || op instanceof Integer){
            try {
                Calculator calculator = new NumberCalculator();
                Method m = calculator.getClass().getMethod(name, parameterTypes);
                return m.invoke(calculator, args);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                Logger.getLogger(BinaryOperator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(op instanceof Boolean){
            try {
                Calculator calculator = new BooleanCalculator();
                Method m = calculator.getClass().getMethod(name, parameterTypes);
                return m.invoke(calculator, args);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                Logger.getLogger(BinaryOperator.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        return null;
    }
}
