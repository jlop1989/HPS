package operator.operation;

import evaluator.CalculatorEvaluator;
import model.Constant;
import operator.Operator;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void MultDoubleDouble() {
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Double(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("*"),new CalculatorEvaluator());
        assertEquals(200.0, root.evaluate());
    }

    @Test
    public void MultDoubleInteger() {
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Integer(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("*"),new CalculatorEvaluator());
        assertEquals(200.0, root.evaluate());
    }

    @Test
    public void MultIntegerDouble() {
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Double(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("*"),new CalculatorEvaluator());
        assertEquals(200.0, root.evaluate());
    }

    @Test
    public void MultIntegerInteger() {
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Integer(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("*"),new CalculatorEvaluator());
        assertEquals(200, root.evaluate());
    }
}
