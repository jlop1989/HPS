package operator.operation;

import model.Token;
import evaluator.Evaluator;
import operator.operation.Operation;
import operator.Operator;

public class BinaryOperation extends Operation {

    private Token left, right;

    public BinaryOperation(Token left, Token right, Operator operator, Evaluator evaluator) {
        super(operator, evaluator);
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
        return evaluator.evaluate(operator,new Object[]{leftOperand,rightOperand});
    }

    @Override
    public String toString() {
        return left.toString()+operator.getSymbol()+right.toString();
    }

}
