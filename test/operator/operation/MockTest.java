package operator.operation;

import calculator.DivisionByZeroException;
import evaluator.CalculatorEvaluator;
import model.Constant;
import operator.Operator;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MockTest {
    
    @Test
    public void AdditionMockTest() {
        Constant a = mock(Constant.class);
        when(a.evaluate()).thenReturn(new Double(20));
        Constant b = mock(Constant.class);
        when(b.evaluate()).thenReturn(new Double(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals(40.0, root.evaluate());
    }
    
    @Test
    public void SubstractionMockTest() {
        Constant a = mock(Constant.class);
        when(a.evaluate()).thenReturn(new Double(20));
        Constant b = mock(Constant.class);
        when(b.evaluate()).thenReturn(new Double(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("-"),new CalculatorEvaluator());
        assertEquals(0.0, root.evaluate());
    }
    
    @Test
    public void MultiplicationMockTest() {
        Constant a = mock(Constant.class);
        when(a.evaluate()).thenReturn(new Double(20));
        Constant b = mock(Constant.class);
        when(b.evaluate()).thenReturn(new Double(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("*"),new CalculatorEvaluator());
        assertEquals(400.0, root.evaluate());
    }
    
    @Test
    public void DiviionMockTest() {
        Constant a = mock(Constant.class);
        when(a.evaluate()).thenReturn(new Double(2));
        Constant b = mock(Constant.class);
        when(b.evaluate()).thenReturn(new Double(0));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("/"),new CalculatorEvaluator());
        try{
            assertEquals(2.0, root.evaluate());
            fail("Division By Zero");
        }
        catch (DivisionByZeroException ex){
            assertTrue(true);
        }
    }
}
