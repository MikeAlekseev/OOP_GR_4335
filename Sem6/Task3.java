package Sem6;

public interface TwoDimensionalShape {
    double area();
}

public interface ThreeDimensionalShape extends TwoDimensionalShape {
    double volume();
}

public class Circle implements TwoDimensionalShape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

public class Cube implements ThreeDimensionalShape {
    private int edge;
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
