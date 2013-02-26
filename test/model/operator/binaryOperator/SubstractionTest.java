package model.operator.binaryOperator;

import model.Constant;
import model.Token;
import model.Value;
import static org.junit.Assert.*;
import org.junit.Test;

public class SubstractionTest {

    @Test
    public void SubDoubleDouble() {
        Value<Double> val = new Value<>(20.0);
        Value<Double> val2 = new Value<>(10.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "sub");
        assertEquals(10.0, root.evaluate());
    }

    @Test
    public void SubDoubleInteger() {
        Value<Double> val = new Value<>(20.0);
        Value<Integer> val2 = new Value<>(10);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "sub");
        assertEquals(10.0, root.evaluate());
    }

    @Test
    public void SubIntegerDouble() {
        Value<Integer> val = new Value<>(20);
        Value<Double> val2 = new Value<>(10.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "sub");
        assertEquals(10.0, root.evaluate());
    }

    @Test
    public void SubIntegerInteger() {
        Value<Integer> val = new Value<>(20);
        Value<Integer> val2 = new Value<>(10);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "sub");
        assertEquals(10, root.evaluate());
    }
}
