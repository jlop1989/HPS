package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConstantTest {

    @Test
    public void DoubleConstantTest() {
        Constant<?> constant = new Constant(new Double(20));
        assertEquals(20.0, constant.evaluate());
    }
    
    @Test
    public void IntegerConstantTest() {
        Constant<?> constant = new Constant(new Integer(20));
        assertEquals(20, constant.evaluate());
    }
    
    @Test
    public void BooleanTrueConstantTest() {
        Constant<?> constant = new Constant(new Boolean(true));
        assertEquals(Boolean.TRUE,constant.evaluate());
    }
    
    @Test
    public void BooleanFalseConstantTest() {
        Constant<?> constant = new Constant(new Boolean(false));
        assertEquals(Boolean.FALSE,constant.evaluate());
    }
    
    @Test
    public void StringConstantTest() {
        Constant<?> constant = new Constant("hola mundo");
        assertEquals("hola mundo",constant.evaluate());
    }
}
