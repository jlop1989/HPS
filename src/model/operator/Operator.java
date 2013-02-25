package model.operator;

import model.Token;

public abstract class Operator extends Token {

    protected String name;

    public Operator(String name) {
        this.name = name;
    }
}
