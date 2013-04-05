package operator.operation;

import evaluator.CalculatorEvaluator;
import model.Constant;
import operator.Operator;
import static org.junit.Assert.*;
import org.junit.Test;

public class AdditionTest {

    @Test
    public void AddDoubleDouble() {
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Double(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals(40.0, root.evaluate());
    }

    @Test
    public void AddDoubleInteger() {
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Integer(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals(40.0, root.evaluate());
    }

    @Test
    public void AddIntegerDouble() {
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Double(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals(40.0, root.evaluate());
    }

    @Test
    public void AddIntegerInteger() {
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Integer(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals(40, root.evaluate());
    }
}
