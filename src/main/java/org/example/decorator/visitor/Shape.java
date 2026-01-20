package org.example.decorator.visitor;

public interface Shape {
    double accept(Visitor visitor);
}
