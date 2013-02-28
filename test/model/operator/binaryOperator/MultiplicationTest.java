package model.operator.binaryOperator;

import model.Constant;
import model.Token;
import model.Value;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void MultDoubleDouble() {
        Value<Double> val = new Value<>(20.0);
        Value<Double> val2 = new Value<>(10.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperation(a, b, "mult");
        assertEquals(200.0, root.evaluate().getValue());
    }

    @Test
    public void MultDoubleInteger() {
        Value<Double> val = new Value<>(20.0);
        Value<Integer> val2 = new Value<>(10);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperation(a, b, "mult");
        assertEquals(200.0, root.evaluate().getValue());
    }

    @Test
    public void MultIntegerDouble() {
        Value<Integer> val = new Value<>(20);
        Value<Double> val2 = new Value<>(10.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperation(a, b, "mult");
        assertEquals(200.0, root.evaluate().getValue());
    }

    @Test
    public void MultIntegerInteger() {
        Value<Integer> val = new Value<>(20);
        Value<Integer> val2 = new Value<>(10);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperation(a, b, "mult");
        assertEquals(200, root.evaluate().getValue());
    }
}
