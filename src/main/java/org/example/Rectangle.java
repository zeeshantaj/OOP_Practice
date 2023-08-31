package org.example;

public class Rectangle {
    double width, height;

    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth() {
        return width;

    }
    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(7, 12);

        System.out.println("this is height "+rectangle.getHeight());
        System.out.println("this is width "+rectangle.getWidth());
        System.out.println("this is Area  "+rectangle.getArea());
        System.out.println("this is Perimeter "+rectangle.getPerimeter());



        rectangle.setWidth(6);
        rectangle.setHeight(12);

        System.out.println("this is updated Area "+rectangle.getArea());
        System.out.println("this is updated Perimeter "+rectangle.getPerimeter());


    }
}
