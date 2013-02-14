/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.node.unaryOperators;

import model.node.UnaryOperatorNode;
import model.node.Node;

/**
 *
 * @author julio
 */
public class SinOperatorNode extends UnaryOperatorNode{

    public SinOperatorNode(Node operand) {
        super(operand);
    }
    
    @Override
    public double evaluate() {
        return Math.sin(operand.evaluate());
    }
    
}
