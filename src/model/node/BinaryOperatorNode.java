package model.node;

import model.node.Node;
import model.node.OperatorNode;

public abstract class BinaryOperatorNode implements OperatorNode{
    protected Node firstOperand;
    protected Node secondOperand;

    public BinaryOperatorNode(Node firstOperand, Node secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public Node getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(Node firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Node getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Node secondOperand) {
        this.secondOperand = secondOperand;
    }
}
