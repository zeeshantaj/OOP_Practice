package org.example;

public class Polymorphism_con {

}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }

    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();

    }
}