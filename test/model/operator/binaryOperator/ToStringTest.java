package model.operator.binaryOperator;

import model.Constant;
import model.evaluator.CalculatorEvaluator;
import model.operator.Operator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ToStringTest {
    
    @Test
    public void test1(){
        Constant a = new Constant(new Double(20));
        Constant b = new Constant(new Double(20));
        BinaryOperation root = new BinaryOperation(a, b, Operator.get("+"),new CalculatorEvaluator());
        System.out.println(root.toString());
    }
    
}
