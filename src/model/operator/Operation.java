package model.operator;

import model.evaluator.Evaluator;
import model.Token;

public abstract class Operation extends Token {

    protected Operator operator;
    protected Evaluator evaluator;

    public Operation(Operator operator, Evaluator evaluator) {
        this.operator = operator;
        this.evaluator = evaluator;
    }

    public Operator getOperator() {
        return operator;
    }

    public Evaluator getEvaluator() {
        return evaluator;
    }
}
