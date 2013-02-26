package model.operator.binaryOperator;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
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
        if (isNumericOperation(leftOperand, rightOperand)) {
            return new NumberCalculator().calculate(name, leftOperand, rightOperand);
        }

        if (isBooleanOperation(leftOperand, rightOperand)) {
            return calculate(name,leftOperand, rightOperand);

        }
        return null;
    }

    private boolean isNumericOperation(Object o1, Object o2) {
        return ((o1 instanceof Double || o2 instanceof Integer)
                && (o1 instanceof Double || o2 instanceof Integer));

    }

    private boolean isBooleanOperation(Object o1, Object o2) {
        return o1 instanceof Boolean && o2 instanceof Boolean;
    }

    private Object calculate(String name,Object leftOperand, Object rightOperand) {
        try {
            Calculator calculator = new BooleanCalculator();
            Method m = calculator.getClass().getMethod(name, new Class<?>[]{leftOperand.getClass(), rightOperand.getClass()});
            return m.invoke(calculator, new Object[]{leftOperand, rightOperand});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
             
        }
        return null;
    }
}
