/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.node.ConstantNode;
import model.node.binaryOperators.MultiplicationOperatorNode;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author julio
 */
public class MultiplicationOperatorTest {
    
    @Test
    public void MultiplicationTest(){
        ConstantNode op1= new ConstantNode(3);
        ConstantNode op2= new ConstantNode(2);
        MultiplicationOperatorNode mult= new MultiplicationOperatorNode(op1, op2);
        assertEquals(6, mult.evaluate(),0.01);        
    }
    
    @Test
    public void NegativeMultiplicationTest(){
        ConstantNode op1= new ConstantNode(3);
        ConstantNode op2= new ConstantNode(-2);
        MultiplicationOperatorNode mult= new MultiplicationOperatorNode(op1, op2);
        assertEquals(-6, mult.evaluate(),0.01);        
    }
    
    @Test
    public void MutipleMultiplicationsTest(){
        ConstantNode op1= new ConstantNode(3);
        ConstantNode op2= new ConstantNode(2);
        ConstantNode op3= new ConstantNode(5);
        MultiplicationOperatorNode mult1= new MultiplicationOperatorNode(op1, op2);
        MultiplicationOperatorNode mult2= new MultiplicationOperatorNode(mult1, op3);
        assertEquals(30, mult2.evaluate(),0.01);        
    }
}
