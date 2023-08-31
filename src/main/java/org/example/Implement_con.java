package org.example;

public class Implement_con {
}
 interface Shape1{
    abstract double  calculate();
}

class Circle1 implements Shape1 {

    double radius;

    public void Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("AREA."+circle.calculateArea());
    }
}
