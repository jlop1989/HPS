package syntaxTree;

import model.*;
import model.node.ConstantNode;
import model.node.Node;
import model.node.binaryOperators.AdditionOperatorNode;
import model.node.binaryOperators.MultiplicationOperatorNode;

public class SyntaxTree {

    public static void main(String[] args) {
        AritmeticExpression expression;
        Node constant1= new ConstantNode(1);
        Node constant2= new ConstantNode(2);
        Node constant3= new ConstantNode(3);
        Node operation1= new MultiplicationOperatorNode(constant2, constant3);
        Node operation2= new AdditionOperatorNode(constant1, operation1);
        expression= new AritmeticExpression(operation2);
        
        System.out.println("Expresion: 1+2*3 = "+expression.evaluate());
    }
}
