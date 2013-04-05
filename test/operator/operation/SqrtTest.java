package operator.operation;

import evaluator.CalculatorEvaluator;
import model.Constant;
import operator.Operator;
import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {

    public SqrtTest() {
    }

    @Test
    public void SqrtDouble() {
        Constant a = new Constant(new Double(25));
        UnaryOperation root = new UnaryOperation(a, Operator.get("sqrt"),new CalculatorEvaluator());
        assertEquals(5.0, root.evaluate());
    }

    @Test
    public void SqrtInteger() {
        Constant a = new Constant(new Integer(25));
        UnaryOperation root = new UnaryOperation(a, Operator.get("sqrt"),new CalculatorEvaluator());
        assertEquals(5, root.evaluate());
    }

}
