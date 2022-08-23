package oop.animal;

public class PolyClass {
    int Animal = 1;
    int PET = 2;
    public void act(Animal animal){
        animal.eat();
        animal.walk();
    };
    public void act(Pet pet){
        pet.play();
    };



}
