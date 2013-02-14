package model.node.unaryOperators;

import model.node.Node;
import model.node.UnaryOperatorNode;

public class SqrtOperatorNode extends UnaryOperatorNode{

    public SqrtOperatorNode(Node operand) {
        super(operand);
    }
    
    @Override
    public double evaluate() {
        return Math.sqrt(operand.evaluate());
    }
    
}
