package org.example;

public class Objects_and_Classes {

}

 class Car{
     String color;
     String model;


     void Engine(){
         System.out.println("Engine Started");
     }
     void Stop(){
         System.out.println("Engine Stop");
     }

     public static void main(String[] args) {
         Car objectCar = new Car();
         objectCar.color = "red";
         objectCar.model = "civic";
         objectCar.Engine();
         objectCar.Stop();
         System.out.println(objectCar.color);
         System.out.println(objectCar.model);
         if (objectCar.color.equals("blue") && objectCar.model.equals("civic")){
             objectCar.Engine();
         }
         else {
             objectCar.Stop();
         }
     }
 }

