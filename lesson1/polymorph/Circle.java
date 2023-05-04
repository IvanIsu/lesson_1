package lesson1.polymorph;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double CalculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
