package model.node.binaryOperators;

import model.node.BinaryOperatorNode;
import model.node.Node;

public class MultiplicationOperatorNode extends BinaryOperatorNode{
    
    public MultiplicationOperatorNode(Node firstOperand, Node secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate() {
        return firstOperand.evaluate()*secondOperand.evaluate();
   }
    
}
