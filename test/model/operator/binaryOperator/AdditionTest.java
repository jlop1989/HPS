package model.operator.binaryOperator;

import model.Constant;
import model.Token;
import model.Value;
import static org.junit.Assert.*;
import org.junit.Test;

public class AdditionTest {

    @Test
    public void AddDoubleDouble() {
        Value<Double> val = new Value<>(20.0);
        Value<Double> val2 = new Value<>(20.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "add");
        assertEquals(40.0, root.evaluate().getValue());
    }

    @Test
    public void AddDoubleInteger() {
        Value<Double> val = new Value<>(20.0);
        Value<Integer> val2 = new Value<>(20);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "add");
        assertEquals(40.0, root.evaluate().getValue());
    }

    @Test
    public void AddIntegerDouble() {
        Value<Integer> val = new Value<>(20);
        Value<Double> val2 = new Value<>(20.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "add");
        assertEquals(40.0, root.evaluate().getValue());
    }

    @Test
    public void AddIntegerInteger() {
        Value<Integer> val = new Value<>(20);
        Value<Integer> val2 = new Value<>(20);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "add");
        assertEquals(40, root.evaluate().getValue());
    }
}
