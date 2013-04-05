package operator.operation;

import calculator.DivisionByZeroException;
import evaluator.CalculatorEvaluator;
import model.Constant;
import operator.Operator;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivisionTest {

    @Test
    public void DivDoubleDouble() {
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Double(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("/"),new CalculatorEvaluator());
        assertEquals(2.0, root.evaluate());
    }
    

    @Test
    public void DivDoubleInteger() {
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Integer(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("/"),new CalculatorEvaluator());
        assertEquals(2.0, root.evaluate());
    }

    @Test
    public void DivIntegerDouble() {
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Double(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("/"),new CalculatorEvaluator());
        assertEquals(2.0, root.evaluate());
    }

    @Test
    public void DivIntegerInteger() {
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Integer(10));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("/"),new CalculatorEvaluator());
        assertEquals(2, root.evaluate());
    }
    
    @Test
    public void DivByZero(){
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Integer(0));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("/"),new CalculatorEvaluator());
        
        try{
            assertEquals(2.0, root.evaluate());
            fail("Division By Zero");
        }
        catch (DivisionByZeroException e){
            assertTrue(true);
        }
    }
}
