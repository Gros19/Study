package oop.animal;

public class Spider extends Animal{
    public Spider(int legs) {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("거미는 "+legs+"개의 다리를 이용해서 먹이를 잡습니다.");
    }
}
