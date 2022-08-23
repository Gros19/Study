package oop.animal;



public class PolyClass {
    int Animal = 1;
    int PET = 2;
    public void act(Animal animal){
        animal.eat();
    };

    public void act2(Animal animal){
        System.out.println(animal.toString());
        animal.walk();
    };
    public void act(Pet pet){
        pet.play();
    };


}
