package Circle;

import java.awt.geom.Area;

public class class_hinhTron {
    private double radius=1.0;
    private String color="red";

    public class_hinhTron() {
    }

    public class_hinhTron(double radius) {
        this.radius = radius;
    }

    public class_hinhTron(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea()
    {
        double Area = 0;
        return Area;
    }

    @Override
    public String toString() {
        return "class_hinhTron{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
