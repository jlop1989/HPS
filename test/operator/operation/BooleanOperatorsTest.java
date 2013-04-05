package operator.operation;

import evaluator.CalculatorEvaluator;
import model.Constant;
import model.Variable;
import operator.Operator;
import static org.junit.Assert.*;
import org.junit.Test;

public class BooleanOperatorsTest {

    @Test
    public void AndFalseFalse() {
        Constant constant1 = new Constant(false);
        Constant constant2 = new Constant(false);
        BinaryOperation and = new BinaryOperation(constant1, constant2, Operator.get("&&"), new CalculatorEvaluator());
        assertEquals(false, and.evaluate());
    }
    
    @Test
    public void AndFalseTrue() {
        Constant constant1 = new Constant(false);
        Constant constant2 = new Constant(true);
        BinaryOperation and = new BinaryOperation(constant1, constant2, Operator.get("&&"), new CalculatorEvaluator());
        assertEquals(false, and.evaluate());
    }
    
    @Test
    public void AndTrueFalse() {
        Constant constant1 = new Constant(true);
        Constant constant2 = new Constant(false);
        BinaryOperation and = new BinaryOperation(constant1, constant2, Operator.get("&&"), new CalculatorEvaluator());
        assertEquals(false, and.evaluate());
    }
    
    @Test
    public void AndTrueTrue() {
        Constant constant1 = new Constant(true);
        Constant constant2 = new Constant(true);
        BinaryOperation and = new BinaryOperation(constant1, constant2, Operator.get("&&"), new CalculatorEvaluator());
        assertEquals(true, and.evaluate());
    }
    
    @Test
    public void OrFalseFalse() {
        Constant constant1 = new Constant(false);
        Constant constant2 = new Constant(false);
        BinaryOperation or = new BinaryOperation(constant1, constant2, Operator.get("||"), new CalculatorEvaluator());
        assertEquals(false, or.evaluate());
    }
    
    @Test
    public void OrFalseTrue() {
        Constant constant1 = new Constant(false);
        Constant constant2 = new Constant(true);
        BinaryOperation or = new BinaryOperation(constant1, constant2, Operator.get("||"), new CalculatorEvaluator());
        assertEquals(true, or.evaluate());
    }
    
    @Test
    public void OrTrueFalse() {
        Constant constant1 = new Constant(true);
        Constant constant2 = new Constant(false);
        BinaryOperation or = new BinaryOperation(constant1, constant2, Operator.get("||"), new CalculatorEvaluator());
        assertEquals(true, or.evaluate());
    }
    
    @Test
    public void OrTrueTrue() {
        Constant constant1 = new Constant(true);
        Constant constant2 = new Constant(true);
        BinaryOperation or = new BinaryOperation(constant1, constant2, Operator.get("||"), new CalculatorEvaluator());
        assertEquals(true, or.evaluate());
    }
    
    @Test
    public void NotTest(){
        Variable variable1 = new Variable("x",true);
        UnaryOperation not = new UnaryOperation(variable1, Operator.get("!"),new CalculatorEvaluator());
        assertEquals(false, not.evaluate());
        variable1.setValue(false);
        assertEquals(true, not.evaluate());
    }
}
