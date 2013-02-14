package model.node.binaryOperators;

import model.node.BinaryOperatorNode;
import model.node.Node;

public class AdditionOperatorNode extends BinaryOperatorNode{

    public AdditionOperatorNode(Node firstOperand, Node secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate() {
        return firstOperand.evaluate()+secondOperand.evaluate();
   }
    
}
