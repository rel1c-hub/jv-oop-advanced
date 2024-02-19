package core.basesyntax.figures;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private Color color;

    public Rectangle(Color color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq. units, length: "
                + length + " units, width: " + width + ", color: " + color);
    }
}
