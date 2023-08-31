package org.example;

public class Radius {

    double radius;

    public double getRadius() {
        return radius;
    }

    public Radius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Radius radius1 = new Radius(5);
        System.out.println(radius1.calculateCircumference());
        System.out.println(radius1.getArea());
        System.out.println(radius1.getRadius());

    }
}
