package model.operator.binaryOperator;

import model.Constant;
import model.Constant;
import model.Token;
import model.Token;
import model.Value;
import model.Value;
import model.operator.binaryOperator.BinaryOperator;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryOperatorTest {

    public BinaryOperatorTest() {
    }

    @Test
    public void AddDoubleDouble() {
        Value<Double> val = new Value<>(20.0);
        Value<Double> val2 = new Value<>(20.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "add");
        assertEquals(40.0, root.evaluate());
    }

    @Test
    public void AddDoubleInteger() {
        Value<Double> val = new Value<>(20.0);
        Value<Integer> val2 = new Value<>(20);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "add");
        assertEquals(40.0, root.evaluate());
    }

    @Test
    public void AddIntegerDouble() {
        Value<Integer> val = new Value<>(20);
        Value<Double> val2 = new Value<>(20.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "add");
        assertEquals(40.0, root.evaluate());
    }

    @Test
    public void AddIntegerInteger() {
        Value<Integer> val = new Value<>(20);
        Value<Integer> val2 = new Value<>(20);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "add");
        assertEquals(40, root.evaluate());
    }

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

    @Test
    public void MultDoubleDouble() {
        Value<Double> val = new Value<>(20.0);
        Value<Double> val2 = new Value<>(10.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "mult");
        assertEquals(200.0, root.evaluate());
    }

    @Test
    public void MultDoubleInteger() {
        Value<Double> val = new Value<>(20.0);
        Value<Integer> val2 = new Value<>(10);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "mult");
        assertEquals(200.0, root.evaluate());
    }

    @Test
    public void MultIntegerDouble() {
        Value<Integer> val = new Value<>(20);
        Value<Double> val2 = new Value<>(10.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "mult");
        assertEquals(200.0, root.evaluate());
    }

    @Test
    public void MultIntegerInteger() {
        Value<Integer> val = new Value<>(20);
        Value<Integer> val2 = new Value<>(10);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "mult");
        assertEquals(200, root.evaluate());
    }

    @Test
    public void LessDoubleDouble() {
        Value<Double> val = new Value<>(20.0);
        Value<Double> val2 = new Value<>(10.0);
        Value<Double> val3 = new Value<>(100.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Constant c = new Constant(val3);
        BinaryOperator mult = new BinaryOperator(a, b, "mult");
        Token root = new BinaryOperator(c, mult, "less");
        assertEquals(Boolean.TRUE, root.evaluate());
    }

    @Test
    public void LessDoubleInteger() {
        Value<Double> val = new Value<>(20.0);
        Value<Integer> val2 = new Value<>(10);
        Value<Double> val3 = new Value<>(100.0);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Constant c = new Constant(val3);
        BinaryOperator mult = new BinaryOperator(a, b, "mult");
        Token root = new BinaryOperator(c, mult, "less");
        assertEquals(Boolean.TRUE, root.evaluate());
    }

    @Test
    public void LessIntegerDouble() {
        Value<Integer> val = new Value<>(20);
        Value<Double> val2 = new Value<>(10.0);
        Value<Integer> val3 = new Value<>(100);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Constant c = new Constant(val3);
        BinaryOperator mult = new BinaryOperator(a, b, "mult");
        Token root = new BinaryOperator(c, mult, "less");
        assertEquals(Boolean.TRUE, root.evaluate());
    }

    @Test
    public void LessIntegerInteger() {
        Value<Integer> val = new Value<>(20);
        Value<Integer> val2 = new Value<>(10);
        Value<Integer> val3 = new Value<>(100);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Constant c = new Constant(val3);
        BinaryOperator mult = new BinaryOperator(a, b, "mult");
        Token root = new BinaryOperator(c, mult, "less");
        assertEquals(Boolean.TRUE, root.evaluate());
    }

    @Test
    public void And() {
        Value<Boolean> val = new Value<>(Boolean.TRUE);
        Value<Boolean> val2 = new Value<>(Boolean.FALSE);
        Constant a = new Constant(val);
        Constant b = new Constant(val2);
        Token root = new BinaryOperator(a, b, "and");
        assertEquals(Boolean.FALSE, root.evaluate());
    }
}
