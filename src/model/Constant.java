package model;

public class Constant extends Token {

    private Value value;

    public Constant(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public Object evaluate() {
        return value.getVaue();
    }
}
