package operator.operation;

import evaluator.CalculatorEvaluator;
import model.Constant;
import operator.Operator;
import static org.junit.Assert.*;
import org.junit.Test;

public class ToStringTest {
    
    @Test
    public void ToStringTestDoubleDouble(){
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Double(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals("20.0+20.0", root.toString());
    }
    
    @Test
    public void ToStringTestDoubleInteger(){
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Integer(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals("20.0+20", root.toString());
    }
    
    @Test
    public void ToStringTestIntegerDouble(){
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Double(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals("20+20.0", root.toString());
    }
    
    @Test
    public void ToStringTestIntegerInteger(){
        Constant a = new Constant(new Integer(20));
        Constant b = new Constant(new Integer(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        assertEquals("20+20", root.toString());
    }
    
}
