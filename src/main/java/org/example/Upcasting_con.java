package org.example;

public class Upcasting_con {
}

class Parent{

    String name;

    void printData(){
        System.out.println("method in Parent");
    }
}
class Child extends Parent{

    int age;
    void printData(){
        System.out.println("method in Child");
    }

    public static void main(String[] args) {
        System.out.println("Example of Upcasting");
        Parent parent = new Child();
        Parent parent1 = new Child();
        parent.printData();
        parent1.printData();


        /*
         todo its downCasting
          if we downCast in this way its give compile time error
          Child child = new parent()
          so we cast explicitly
          e.g child chile = (Child) parent;
         */
        System.out.println("Example of DownCasting");
        Child child = (Child) parent;
        child.name = "zee";
        child.age = 21;
        System.out.println(child.name);
        System.out.println(child.age);
        child.printData();
    }
}

