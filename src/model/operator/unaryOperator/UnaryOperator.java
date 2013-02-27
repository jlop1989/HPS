package model.operator.unaryOperator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Token;
import model.Value;
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
    public Value evaluate() {
        Object op = operand.evaluate();
        if (isNumericOperation(op)){
            return new Value(new NumberCalculator().calculate(name, op));
        }
        if(isBooleanOperation(op)){
            return new Value(new BooleanCalculator().calculate(name, op)); 
        }
        return null;
    }

    private boolean isNumericOperation(Object op) {
        return op instanceof Double || op instanceof Integer;
    }

    private boolean isBooleanOperation(Object op) {
        return op instanceof Boolean;
    }
}
