package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class VariableTest {
    
    @Test
    public void VariableTest() {
        Variable variable = new Variable("x",new Double(20));
        assertEquals("x", variable.getName());
        assertEquals(20.0, variable.evaluate());
        variable.setValue(new Integer(20));
        assertEquals(20, variable.evaluate());
        variable.setValue(true);
        assertEquals(true, variable.evaluate());
        variable.setValue("hola mundo");
        assertEquals("hola mundo", variable.evaluate());        
    }
}
