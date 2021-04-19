package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;
import java.util.*;

public class TriangleEquilatero extends Triangle {
    private int side;

    public TriangleEquilatero(int side) {
        this.side = side;
    }

    public float getPerimeter() {
        float a = side*3;
        return a;
    }

    public double getArea() {
        double a = (Math.sqrt(side*side-(side/2)*(side/2)))*side/2;
        return a;
    }
}
