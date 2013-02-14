package test;

import model.node.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class ConstantNodeTest {
    
    @Test
    public void ConstantNodeTest() {
        ConstantNode nod=new ConstantNode(10);
        assertEquals(10, nod.evaluate(),0.01);
    }
    @Test
    public void NegativeConstantNodeTest() {
        ConstantNode nod=new ConstantNode(-7);
        assertEquals(-7, nod.evaluate(),0.01);
    }
}
