package org.example.decorator.visitor;

public interface Visitor {
    double visit(Square square);
    double visit(Rectangle rectangle);
}
