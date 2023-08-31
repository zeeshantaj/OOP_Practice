package org.example;

public class Dog2 {

    String name, breed;
    public Dog2(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }


    public static void main(String[] args) {
        Dog2 dog2 = new Dog2("trac", "labra");
        Dog2 dog3 = new Dog2("gem", "germanShepherd");
        System.out.println(dog2.getName()+" "+dog2.getBreed());
        dog2.setName("tarac2");
        dog2.setBreed("labra2");
        System.out.println("updated "+dog2.getName()+" "+dog2.getBreed());


    }


}
