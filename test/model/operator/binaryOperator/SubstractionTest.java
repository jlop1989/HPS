package model.operator.binaryOperator;

import model.Constant;
import model.Token;
import model.evaluator.CalculatorEvaluator;
import model.operator.Operator;
import static org.junit.Assert.*;
import org.junit.Test;

public class SubstractionTest {

    @Test
    public void SubDoubleDouble() {
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Double(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("-"),new CalculatorEvaluator());
        assertEquals(10.0, root.evaluate());
    }

    @Test
    public void SubDoubleInteger() {
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Integer(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("-"),new CalculatorEvaluator());
        assertEquals(10.0, root.evaluate());
    }

    @Test
    public void SubIntegerDouble() {
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Double(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("-"),new CalculatorEvaluator());
        assertEquals(10., root.evaluate());
    }

    @Test
    public void SubIntegerInteger() {
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Integer(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("-"),new CalculatorEvaluator());
        assertEquals(10, root.evaluate());
    }
}
