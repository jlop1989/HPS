package model.node;

import model.node.Node;
import model.node.OperatorNode;

public abstract class UnaryOperatorNode implements OperatorNode{
    protected Node operand;

    public UnaryOperatorNode(Node operand) {
        this.operand = operand;
    }

    public Node getOperand() {
        return operand;
    }

    public void setOperand(Node operand) {
        this.operand = operand;
    }
}
