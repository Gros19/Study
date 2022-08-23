package oop.animal;

public class TestPrint {
    public static void main(String[] args) {
        PolyClass pc = new PolyClass();
        Spider s = new Spider(89);
        Animal c = new Cat(5);
        Fish f = new Fish(432);

        pc.act((Animal)s);//
        pc.act((Animal)c);//
        pc.act((Animal) f);
        System.out.println();
        pc.act((Pet) c);
        pc.act((Pet) f);

        System.out.println();

        pc.act2((Animal)f);
        pc.act2((Animal)c);

        System.out.println();
        //c.setName("낭만고양이");
        pc.act2((Animal)c);

    }
}
