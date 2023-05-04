package lesson1.polymorph;

public class Triangle extends Shape{

    private Double sideBottom;
    private Double height;

    public Triangle(Double sideBottom, Double height) {

        this.sideBottom = sideBottom;
        this.height = height;
    }

    @Override
    public Double CalculateArea() {
        return 0.5 * (sideBottom * height);
    }
}
