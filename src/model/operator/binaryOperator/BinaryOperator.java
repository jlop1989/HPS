package model.operator.binaryOperator;

import model.Token;
import model.Value;
import model.calculator.BooleanCalculator;
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
    public Value evaluate() {
        Object leftOperand = left.evaluate().getValue();
        Object rightOperand = right.evaluate().getValue();
        if (isNumericOperation(leftOperand, rightOperand)) 
            return new Value(new NumberCalculator().calculate(name, leftOperand, rightOperand));
        if (isBooleanOperation(leftOperand, rightOperand)) 
            return new Value(new BooleanCalculator().calculate(name, leftOperand, rightOperand));
        return null;
    }

    private boolean isNumericOperation(Object o1, Object o2) {
        return ((o1 instanceof Double || o1 instanceof Integer)
                && (o2 instanceof Double || o2 instanceof Integer));
    }

    private boolean isBooleanOperation(Object o1, Object o2) {
        return o1 instanceof Boolean && o2 instanceof Boolean;
    }
}
