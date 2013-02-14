/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.node.ConstantNode;
import model.node.binaryOperators.SubstractionOperatorNode;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author julio
 */
public class SubstractionOperatorTest {
    
    @Test
    public void SubstractionTest(){
        ConstantNode op1= new ConstantNode(3);
        ConstantNode op2= new ConstantNode(2);
        SubstractionOperatorNode sub= new SubstractionOperatorNode(op1, op2);
        assertEquals(1, sub.evaluate(),0.01);        
    }
    
    @Test
    public void NegativeSubstractionTest(){
        ConstantNode op1= new ConstantNode(2);
        ConstantNode op2= new ConstantNode(3);
        SubstractionOperatorNode sub= new SubstractionOperatorNode(op1, op2);
        assertEquals(-1, sub.evaluate(),0.01);        
    }
    
    @Test
    public void MultipleSubstractionsTest(){
        ConstantNode op1= new ConstantNode(3);
        ConstantNode op2= new ConstantNode(2);
        ConstantNode op3= new ConstantNode(2);
        SubstractionOperatorNode sub1= new SubstractionOperatorNode(op1, op2);
        SubstractionOperatorNode sub2= new SubstractionOperatorNode(sub1, op3);
        assertEquals(-1, sub2.evaluate(),0.01);        
    }
}
