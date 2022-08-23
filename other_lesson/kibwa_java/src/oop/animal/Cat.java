package oop.animal;

public class Cat extends Animal implements Pet{
    private String name;



    public Cat(int legs) {
        super(legs);
        this.name =  "도둑고양이";

    }


    @Override
    public String toString() {
        return "이름: "+ name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void play() {

        System.out.println(name+"는 혼자 돌아다닙니다.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("도둑고양이는 거미와 쥐를 잡아 먹습니다.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(this.toString());
        System.out.println("다리갯수 :" + legs);
    }
}
