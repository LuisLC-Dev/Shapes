package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private int radio;
    private static final int side=1;
    public static final double pi=3.14159;

    public Circle(int radio) {
        this.radio = radio;
    }

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING

    // Sobrecarga = Overloading // polimorfismo

    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras

    public String getName() {
        return "Circle";
    }

    public int getRadio() {
        return radio;
    }

    public int getSidesCount() {
        return side;
    }

    public float getPerimeter() {
        float a = (float) (pi*radio*2);
        return a;
    }

    public double getArea() {
        double a = pi*radio*radio;
        return a;
    }
}

