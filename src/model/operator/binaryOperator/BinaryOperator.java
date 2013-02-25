package model.operator.binaryOperator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Token;
import model.calculator.BooleanCalculator;
import model.calculator.Calculator;
import model.calculator.NumberCalculator;
import model.operator.Operator;

public class BinaryOperator extends Operator {

    private Token left, right;

    public BinaryOperator(Token left, Token right, String name) {
        super(name);
        this.left = left;
        this.right = right;
    }

    public Token getLeft() {
        return left;
    }

    public Token getRight() {
        return right;
    }

    @Override
    public Object evaluate() {
        Object leftOperand = left.evaluate();
        Object rightOperand = right.evaluate();
        Object[] args = {leftOperand, rightOperand};
        Class<?>[] parameterTypes = {leftOperand.getClass(), rightOperand.getClass()};
        if ((leftOperand instanceof Double || leftOperand instanceof Integer)
                && (rightOperand instanceof Double || rightOperand instanceof Integer)) {
            try {
                Calculator calculator = new NumberCalculator();
                Method m = calculator.getClass().getMethod(name, parameterTypes);
                return m.invoke(calculator, args);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                Logger.getLogger(BinaryOperator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (leftOperand instanceof Boolean && rightOperand instanceof Boolean) {
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
