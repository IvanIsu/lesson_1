package lesson1.polymorph;

public class Square extends Shape{

    private Double SideA;

    public Square(double sideA) {
        SideA = sideA;
    }

    public Double getSideA() {
        return SideA;
    }

    @Override
    public Double CalculateArea() {
        return SideA * SideA;
    }
}
