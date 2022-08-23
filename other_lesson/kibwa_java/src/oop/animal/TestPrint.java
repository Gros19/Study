package oop.animal;

public class TestPrint {
    public static void main(String[] args) {
        PolyClass pc = new PolyClass();
        pc.act((Animal) new Spider(8));
        pc.act((Animal) new Cat(4));
        pc.act((Animal) new Fish(4));
        System.out.println();
        pc.act((Pet) new Cat(4));
        pc.act((Pet) new Fish(4));

        System.out.println();

        pc.act2((Animal) new Fish(4));
        pc.act2((Animal) new Cat(4));

    }
}
