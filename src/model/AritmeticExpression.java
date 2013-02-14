package model;

import model.node.Node;

public class AritmeticExpression {
    
    private Node root;

    public AritmeticExpression(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
        
    public double evaluate(){
         return root.evaluate();
    }
        
}
