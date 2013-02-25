package model;

public class Value<T> {

    private T value;

    public Value(T value) {
        this.value = value;
    }

    public T getVaue() {
        return value;
    }

    public void setVaue(T value) {
        this.value = value;
    }
}
