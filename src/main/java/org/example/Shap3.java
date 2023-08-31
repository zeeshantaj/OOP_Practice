package org.example;

public abstract class Shap3 {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle1 extends Shap3{


    private double length;
    private double width;
    public Rectangle1(double length,double width) {
        this.length = length;
        this.width = width;

    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
}
class Circle4 extends Shap3{
    private double radius;

    public Circle4(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Triangle extends Shap3{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
class Main2{
    public static void main(String[] args) {
        Shap3 rectangle = new Rectangle1(10,12);
        Shap3 triangle = new Triangle(7, 8, 6);
        Shap3 circle4 = new Circle4(5);
        // calculate area and perimeter of each shape
        System.out.println("\nArea and perimeter of various shapes:");
        System.out.println("\nRectangle: Length-10, Width-12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nCircle: Radius-5");
        System.out.println("Area: " + circle4.getArea());
        System.out.println("Perimeter: " + circle4.getPerimeter());

        System.out.println("\nTriangle: Side1-7, Side2-8, Side3-6");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}

