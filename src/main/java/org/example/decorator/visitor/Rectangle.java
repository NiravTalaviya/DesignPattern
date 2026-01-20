package org.example.decorator.visitor;

public class Rectangle implements Shape {

    int l, b = 0;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
