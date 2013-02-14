package test;

import model.node.ConstantNode;
import model.node.binaryOperators.MultiplicationOperatorNode;
import model.node.unaryOperators.CosOperatorNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class CosOperatorTest {
    
    @Test
    public void CosTest() {
        ConstantNode op= new ConstantNode(Math.PI);
        CosOperatorNode cos= new CosOperatorNode(op);
        assertEquals(-1, cos.evaluate(),0.01);
    }
    
    @Test
    public void CosWithOperationTest(){ 
        ConstantNode op= new ConstantNode(Math.PI);
        ConstantNode op2= new ConstantNode(2);
        MultiplicationOperatorNode mult = new MultiplicationOperatorNode(op,op2);
        CosOperatorNode cos= new CosOperatorNode(mult);
        assertEquals(1, cos.evaluate(),0.01);
    }
}
