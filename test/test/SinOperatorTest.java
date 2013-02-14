package test;

import model.node.ConstantNode;
import model.node.binaryOperators.DivisionOperatorNode;
import model.node.binaryOperators.MultiplicationOperatorNode;
import model.node.unaryOperators.SinOperatorNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class SinOperatorTest {
    
        @Test
    public void SinTest() {
        ConstantNode op= new ConstantNode(Math.PI/2);
        SinOperatorNode sin= new SinOperatorNode(op);
        assertEquals(1, sin.evaluate(),0.01);
    }
    
    @Test
    public void SinWithOperationTest(){ 
        ConstantNode op= new ConstantNode(Math.PI);
        ConstantNode op2= new ConstantNode(3);
        ConstantNode op3= new ConstantNode(2);
        MultiplicationOperatorNode mult = new MultiplicationOperatorNode(op,op2);
        DivisionOperatorNode div = new DivisionOperatorNode(mult, op3);
        SinOperatorNode sin= new SinOperatorNode(div);
        assertEquals(-1, sin.evaluate(),0.01);
    }
}
