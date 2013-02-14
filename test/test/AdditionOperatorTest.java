/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.node.ConstantNode;
import model.node.binaryOperators.AdditionOperatorNode;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author julio
 */
public class AdditionOperatorTest {
    
    @Test
    public void AdditionTest(){
        ConstantNode op1= new ConstantNode(3);
        ConstantNode op2= new ConstantNode(2);
        AdditionOperatorNode add= new AdditionOperatorNode(op1, op2);
        assertEquals(5, add.evaluate(),0.01);        
    }
    
    @Test
    public void NegativeAdditionTest(){
        ConstantNode op1= new ConstantNode(-3);
        ConstantNode op2= new ConstantNode(2);
        AdditionOperatorNode add= new AdditionOperatorNode(op1, op2);
        assertEquals(-1, add.evaluate(),0.01);        
    }
    
    public void MultipleAdditionsTest(){
        ConstantNode op1= new ConstantNode(3);
        ConstantNode op2= new ConstantNode(2);
        ConstantNode op3= new ConstantNode(6);
        AdditionOperatorNode add1= new AdditionOperatorNode(op1, op2);
        AdditionOperatorNode add2 = new  AdditionOperatorNode(op3, add1);
        assertEquals(11, add2.evaluate(),0.01);        
    }
}
