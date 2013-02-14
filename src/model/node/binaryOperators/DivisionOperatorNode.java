package model.node.binaryOperators;

import model.node.BinaryOperatorNode;
import model.node.DivisionByZeroException;
import model.node.Node;

public class DivisionOperatorNode extends BinaryOperatorNode{
    public DivisionOperatorNode(Node firstOperand, Node secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate() throws DivisionByZeroException{
        if(secondOperand.evaluate()== 0)
            throw new DivisionByZeroException();
        return firstOperand.evaluate()/secondOperand.evaluate();
   }    
}
