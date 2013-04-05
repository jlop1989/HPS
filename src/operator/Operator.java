
package operator;

import java.util.HashMap;

public class Operator {
    private String symbol;
    private OperatorType type;
    private PrecedenceType precedence;
    private static final HashMap<String,Operator> operatorMap;
    static{
        operatorMap= new HashMap<>();
        operatorMap.put("+", new Operator("+",OperatorType.BINARY,PrecedenceType.LOW));
        operatorMap.put("-", new Operator("-",OperatorType.BINARY,PrecedenceType.LOW));
        operatorMap.put("*", new Operator("*",OperatorType.BINARY,PrecedenceType.HIGH));
        operatorMap.put("/", new Operator("/",OperatorType.BINARY,PrecedenceType.HIGH));
        operatorMap.put("<", new Operator("<",OperatorType.BINARY,PrecedenceType.LOW));
        operatorMap.put("&&", new Operator("&&",OperatorType.BINARY,PrecedenceType.LOW));
        operatorMap.put("||", new Operator("||",OperatorType.BINARY,PrecedenceType.LOW));
        operatorMap.put("!", new Operator("!",OperatorType.UNARY,PrecedenceType.HIGH));
    }

    public Operator(String symbol, OperatorType type, PrecedenceType precedence) {
        this.symbol = symbol;
        this.type = type;
        this.precedence = precedence;
    }
 
    public String getSymbol() {
        return symbol;
    }

    public OperatorType getType() {
        return type;
    }

    public PrecedenceType getPrecedence() {
        return precedence;
    }
    
    public boolean isBinary(){
        return type == OperatorType.BINARY;
    }
 
    public static Operator get(String symbol){
        return operatorMap.get(symbol);
    }

    public boolean isMajorPrecedence(Operator operator) {
        return (this.precedence==PrecedenceType.LOW && operator.precedence==PrecedenceType.HIGH);
    }

}
