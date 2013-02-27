package model.operator.binaryOperator;

import model.Constant;
import model.Token;
import model.Value;
import model.calculator.DivisionByZeroException;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void DivDoubleDouble() {
        Value<Double> val = new Value<>(20.0);
        Value<Double> val2 = new Value<>(10.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "div");
        assertEquals(2.0, root.evaluate().getValue());
    }

    @Test
    public void DivDoubleInteger() {
        Value<Double> val = new Value<>(20.0);
        Value<Integer> val2 = new Value<>(10);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "div");
        assertEquals(2.0, root.evaluate().getValue());
    }

    @Test
    public void DivIntegerDouble() {
        Value<Integer> val = new Value<>(20);
        Value<Double> val2 = new Value<>(10.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "div");
        assertEquals(2.0, root.evaluate().getValue());
    }

    @Test
    public void DivIntegerInteger() {
        Value<Integer> val = new Value<>(20);
        Value<Integer> val2 = new Value<>(10);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "div");
        assertEquals(2, root.evaluate().getValue());
    }
    
    @Test
    public void DivByZero(){
        Value<Integer> val = new Value<>(20);
        Value<Integer> val2 = new Value<>(0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "div");
        try{
            assertEquals(null, root.evaluate().getValue());
            fail("Division By Zero");
        }
        catch (DivisionByZeroException e){
            assertTrue(true);
        }
    }
}
