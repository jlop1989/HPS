package operator.operation;

import operator.operation.BinaryOperation;
import model.Constant;
import evaluator.CalculatorEvaluator;
import operator.Operator;
import operator.Operator;
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
