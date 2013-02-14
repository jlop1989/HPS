package test;

import model.node.VariableNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class VariableNodeTest {
    @Test
    public void VariableNodeTest() {
        VariableNode nod=new VariableNode("X",10);
        assertEquals(10, nod.evaluate(),0.01);
        nod.setValue(20);
        assertEquals(20, nod.evaluate(),0.01);
    }
    @Test
    public void NegativeConstantNodeTest() {
        VariableNode nod=new VariableNode("X",-7);
        assertEquals(-7, nod.evaluate(),0.01);
        nod.setValue(-3);
        assertEquals(-3, nod.evaluate(),0.01);
    }
}
