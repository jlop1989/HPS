package operator.operation;

import model.Token;
import evaluator.Evaluator;
import operator.operation.Operation;
import operator.Operator;

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
