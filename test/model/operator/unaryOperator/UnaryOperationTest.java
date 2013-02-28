package model.operator.unaryOperator;

import model.Constant;
import model.Token;
import model.Value;
import model.operator.binaryOperator.BinaryOperation;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperationTest {

    public UnaryOperationTest() {
    }

    @Test
    public void SqrtDouble() {
        Value<Double> val = new Value<>(25.0);
        Constant a = new Constant(val);
        Token root = new UnaryOperation(a, "sqrt");
        assertEquals(5.0, root.evaluate().getValue());
    }

    @Test
    public void SqrtInteger() {
        Value<Integer> val = new Value<>(25);
        Constant a = new Constant(val);
        Token root = new UnaryOperation(a, "sqrt");
        assertEquals(5.0, root.evaluate().getValue());
    }

    @Test
    public void Not() {
        Value<Boolean> val = new Value<>(Boolean.TRUE);
        Constant a = new Constant(val);
        Token root = new UnaryOperation(a, "not");
        assertEquals(Boolean.FALSE, root.evaluate().getValue());
    }
}
