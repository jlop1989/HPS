package model;

import model.node.Node;

public class SyntaxTree {
    
    private Node root;

    public SyntaxTree(Node root) {
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
