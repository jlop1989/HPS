
package evaluator;

import operator.Operator;

public interface Evaluator {
    Object evaluate(Operator operator, Object[] args);
    //Object evaluate(Operator operator, Object arg);
}
