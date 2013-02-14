package model.node;

public class ConstantNode implements Node{
    private double value;

    public ConstantNode(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    
    @Override
    public double evaluate() {
        return value;
    }
     
    
}
