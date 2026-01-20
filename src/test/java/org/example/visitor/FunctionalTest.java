package org.example.visitor;

import org.example.decorator.visitor.AreaCalculatorVisitor;
import org.example.decorator.visitor.PerimeterCalculator;
import org.example.decorator.visitor.Square;
import org.example.decorator.visitor.Rectangle;
import org.example.decorator.visitor.Shape;
import org.junit.jupiter.api.Test;

class FunctionalTest {
    @Test
    void happyCase() {
        AreaCalculatorVisitor areaCalculatorVisitor = new AreaCalculatorVisitor();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();

        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(5);

        System.out.println("Area of rectangle " + rectangle.accept(areaCalculatorVisitor));
        System.out.println("Area of square " + square.accept(areaCalculatorVisitor));
        System.out.println("Perimeter of rectangle " + rectangle.accept(perimeterCalculator));
        System.out.println("Perimeter of square " + square.accept(perimeterCalculator));
    }
}
