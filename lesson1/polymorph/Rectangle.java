package lesson1.polymorph;

public class Rectangle extends Square {

    private Double SideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        SideB = sideB;
    }

    @Override
    public Double CalculateArea() {
        return super.getSideA() * SideB;
    }
}
