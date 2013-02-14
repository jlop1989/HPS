package model.node.unaryOperators;

import model.node.UnaryOperatorNode;
import model.node.Node;

public class CosOperatorNode extends UnaryOperatorNode{

    public CosOperatorNode(Node operand) {
        super(operand);
    }

    @Override
    public double evaluate() {
        return Math.cos(operand.evaluate());
    }
    
}
