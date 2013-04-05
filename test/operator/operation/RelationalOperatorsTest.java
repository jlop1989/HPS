package operator.operation;

import evaluator.CalculatorEvaluator;
import model.Variable;
import operator.Operator;
import static org.junit.Assert.*;
import org.junit.Test;

public class RelationalOperatorsTest {
    @Test
    public void LessDoubleDouble() {
        Variable variable1 = new Variable("x",new Double(20));
        Variable variable2 = new Variable("y",new Double(10));
        BinaryOperation less = new BinaryOperation(variable1,variable2, Operator.get("<"), new CalculatorEvaluator());
        assertEquals(false, less.evaluate());
        less= new BinaryOperation(variable2,variable1, Operator.get("<"), new CalculatorEvaluator());
        assertEquals(true, less.evaluate());
    }
    
    @Test
    public void LessDoubleInteger() {
        Variable variable1 = new Variable("x",new Double(20));
        Variable variable2 = new Variable("y",new Integer(10));
        BinaryOperation less = new BinaryOperation(variable1,variable2, Operator.get("<"), new CalculatorEvaluator());
        assertEquals(false, less.evaluate());
        variable1 = new Variable("y",new Integer(20));
        variable2 = new Variable("y",new Double(10));
        less= new BinaryOperation(variable2,variable1, Operator.get("<"), new CalculatorEvaluator());
        assertEquals(true, less.evaluate());
    }
    
   @Test
    public void LessIntegerDouble() {
        Variable variable1 = new Variable("x",new Integer(20));
        Variable variable2 = new Variable("y",new Double(10));
        BinaryOperation less = new BinaryOperation(variable1,variable2, Operator.get("<"), new CalculatorEvaluator());
        assertEquals(false, less.evaluate());
        variable1 = new Variable("y",new Double(20));
        variable2 = new Variable("y",new Integer(10));
        less= new BinaryOperation(variable2,variable1, Operator.get("<"), new CalculatorEvaluator());
        assertEquals(true, less.evaluate());
    }

    @Test
    public void LessIntegerInteger() {
        Variable variable1 = new Variable("x",new Integer(20));
        Variable variable2 = new Variable("y",new Integer(10));
        BinaryOperation less = new BinaryOperation(variable1,variable2, Operator.get("<"), new CalculatorEvaluator());
        assertEquals(false, less.evaluate());
        less= new BinaryOperation(variable2,variable1, Operator.get("<"), new CalculatorEvaluator());
        assertEquals(true, less.evaluate());
    }
}
