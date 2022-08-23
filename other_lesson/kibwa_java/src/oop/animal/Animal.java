package oop.animal;

abstract public class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    protected Animal() {
    }

    abstract public void eat();
    public void walk(){}
    public String toString(){
        return "";
    };

    ;

}
