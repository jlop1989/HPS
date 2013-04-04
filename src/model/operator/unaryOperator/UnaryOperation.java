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
        return evaluator.evaluate(operator, new Object[]{operand.evaluate()});
    }

    @Override
    public String toString() {
        return operand.toString()+operator.getSymbol();
    }
}
