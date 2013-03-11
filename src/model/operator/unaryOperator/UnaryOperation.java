package model.operator.unaryOperator;

import model.Token;
import model.evaluator.Evaluator;
import model.operator.Operation;
import model.operator.Operator;

public class UnaryOperation extends Operation{
    private Token operand;

    public UnaryOperation(Token operand, Operator operator, Evaluator evaluator) {
        super(operator, evaluator);
        this.operand = operand;
    }

    public Token getOperand() {
        return operand;
    }

    @Override
    public Object evaluate() {
        return null;
    }

    private boolean isNumericOperation(Object op) {
        return op instanceof Double || op instanceof Integer;
    }

    private boolean isBooleanOperation(Object op) {
        return op instanceof Boolean;
    }
}
