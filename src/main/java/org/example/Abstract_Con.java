package org.example;


public class Abstract_Con {
}



// todo for interface change class to interface and remove abstract

//interface Shape{
abstract class Shape{
    abstract double calculateArea();

}

// todo for interface change extends to implement

//class Circle implements Shape{
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area "+circle.calculateArea());
    }
}
