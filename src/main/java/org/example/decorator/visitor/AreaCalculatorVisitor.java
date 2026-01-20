package org.example.decorator.visitor;

public class AreaCalculatorVisitor implements Visitor {
    @Override
    public double visit(Square square) {
        return square.length*square.length;
    }

    @Override
    public double visit(Rectangle rectangle) {
        return rectangle.l* rectangle.b;
    }

}
