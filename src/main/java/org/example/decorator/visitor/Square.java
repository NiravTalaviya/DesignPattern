package org.example.decorator.visitor;

public class Square implements Shape {
    int length = 0;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
