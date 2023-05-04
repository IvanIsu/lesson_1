package lesson1;

import lesson1.builder.Person;
import lesson1.builder.PersonBuilder;
import lesson1.polymorph.*;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .country("R")
                .build();

        Person person1 = PersonBuilder.builder()
                .country("A")
                .build();


        System.out.println(person);
        System.out.println();
        System.out.println(person1);


        Shape square = new Square(25);
        System.out.println(square.CalculateArea() + " Square");
        Shape rectangle = new Rectangle(20.1, 24.2);
        System.out.println(rectangle.CalculateArea() + " Rectangle");
        Shape triangle = new Triangle(12.0, 2.0);
        System.out.println(triangle.CalculateArea() + " Triangle");
        Shape circle = new Circle(13.0);
        System.out.println(circle.CalculateArea() + " Circle");
    }


//    2. Описать ошибки в коде (см. задание в методичке) и предложить варианты оптимизации.
// В классе Car у поля Engine изменить public на private, у класса Lorry extend Car и implements Moveable, Stpeable , а там все экстендиться.



}
