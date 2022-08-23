package oop.animal;

public class Fish extends Animal implements Pet{

    private String name;
    public Fish(int legs) {
        super(0);
        this.name = "물고기";
    }

    @Override
    public void eat() {
        System.out.println("물고기는 벌레를 먹습니다.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(this.toString());
        System.out.println("물고기는 걷지 못합니다.");
        System.out.println("물고기는 다리가 없는 동물입니다.");
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
        System.out.println(name+"은 하루종일 헤엄치며 놉니다.");
    }

    @Override
    public String toString() {
         super.toString();
        return "이름:" + name;
    }
}
