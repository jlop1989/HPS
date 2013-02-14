package model.node.unaryOperators;

import model.node.Node;
import model.node.UnaryOperatorNode;

public class TanOperatorNode extends UnaryOperatorNode{

    public TanOperatorNode(Node operand) {
        super(operand);
    }

    @Override
    public double evaluate() {
        return Math.tan(operand.evaluate());
    }
    
}
