package test;

import model.node.ConstantNode;
import model.node.binaryOperators.DivisionOperatorNode;
import model.node.binaryOperators.DivisionOperatorNode.DivisionByZeroException;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivisionOperatorTest {
            
    @Test
    public void DivisionTest(){
        ConstantNode op1= new ConstantNode(6);
        ConstantNode op2= new ConstantNode(2);
        DivisionOperatorNode div= new DivisionOperatorNode(op1, op2);
        assertEquals(3, div.evaluate(),0.01);        
    }
    
    @Test
    public void MultipleDivisionsTest(){
        ConstantNode op1= new ConstantNode(12);
        ConstantNode op2= new ConstantNode(3);
        ConstantNode op3= new ConstantNode(2);
        DivisionOperatorNode div1= new DivisionOperatorNode(op1, op2);
        DivisionOperatorNode div2= new DivisionOperatorNode(div1, op3);
        assertEquals(2, div2.evaluate(),0.01);        
    }
    
    @Test
    public void DivisionFailTest(){
        try{
            ConstantNode op1 = new ConstantNode(6);
            ConstantNode op2 = new ConstantNode(0);
            DivisionOperatorNode div = new DivisionOperatorNode(op1, op2);
            double result=div.evaluate();
            fail("Division by zero");   
        }catch (DivisionByZeroException e){
            assertTrue(true);
        }
    }
}
