package model;

public class Variable<T> extends Token {

    private String name;
    private T value;

    public Variable(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public Object evaluate() {
        return value;
    }
}
