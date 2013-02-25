package model.operator.unaryOperator;

import model.Constant;
import model.Token;
import model.Value;
import model.operator.binaryOperator.BinaryOperator;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperatorTest {

    public UnaryOperatorTest() {
    }

    @Test
    public void SqrtDouble() {
        Value<Double> val = new Value<>(25.0);
        Constant a = new Constant(val);
        Token root = new UnaryOperator(a, "sqrt");
        assertEquals(5.0, root.evaluate());
    }

    @Test
    public void SqrtInteger() {
        Value<Integer> val = new Value<>(25);
        Constant a = new Constant(val);
        Token root = new UnaryOperator(a, "sqrt");
        assertEquals(5.0, root.evaluate());
    }

    @Test
    public void Not() {
        Value<Boolean> val = new Value<>(Boolean.TRUE);
        Constant a = new Constant(val);
        Token root = new UnaryOperator(a, "not");
        assertEquals(Boolean.FALSE, root.evaluate());
    }
}
