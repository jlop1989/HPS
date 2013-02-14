package model.node.binaryOperators;

import model.node.BinaryOperatorNode;
import model.node.Node;

public class SubstractionOperatorNode extends BinaryOperatorNode{

    public SubstractionOperatorNode(Node firstOperand, Node secondOperand) {
        super(firstOperand, secondOperand);
    }
    
    @Override
    public double evaluate() {
        return firstOperand.evaluate()-secondOperand.evaluate();
    }
    
}
