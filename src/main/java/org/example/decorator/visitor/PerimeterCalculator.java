package org.example.decorator.visitor;

public class PerimeterCalculator implements Visitor {

    @Override
    public double visit(Square square) {
        return 4*square.length;
    }
    @Override
    public double visit(Rectangle rectangle) {
        return 2*(rectangle.l+ rectangle.b);
    }
}