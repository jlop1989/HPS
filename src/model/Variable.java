package model;

public class Variable extends Token {

    private String name;
    private Value value;

    public Variable(String name, Value value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public Object evaluate() {
        return value.getVaue();
    }
}
