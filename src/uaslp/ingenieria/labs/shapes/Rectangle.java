package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Rectangle";
    }

    public int getSidesCount() {
        return 4;
    }

    public float getPerimeter() {
        float a = base*2+height*2;
        return a;
    }

    public double getArea() {
        double a = height*base;
        return a;
    }

}
