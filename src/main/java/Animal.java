public class Animal {
    void makeSound(){
        System.out.println("Make sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("BARK");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("MEOW");
    }
    public static void main(String[] args) {
        Animal animal;
        Dog dog = new Dog();
        dog.makeSound();

    }
}
