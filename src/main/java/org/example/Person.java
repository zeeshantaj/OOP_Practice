package org.example;

public class Person {

    String name;
    int age;



    public Person(String name){
        this.name = name;


    }
    public Person(int age){
        this.age = age;
    }
    public String  getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person("fusion");
        Person person1 = new Person(12);

        System.out.println(person.getName());
        System.out.println(person1.getAge());

    }
}
