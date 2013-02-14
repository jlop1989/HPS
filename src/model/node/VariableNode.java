package model.node;

public class VariableNode implements Node{
    private String name;
    private double value;

    public VariableNode(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public double evaluate() {
        return value;
    }
    
}
