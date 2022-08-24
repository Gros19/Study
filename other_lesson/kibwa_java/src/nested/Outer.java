package nested;

public class Outer {
    class Inner{
        void javava(){
            System.out.println("잡아봐봐");
        }
    }

    public static void main(String[] args) {
        /*
        Outer o = new Outer();
        Outer.Inner in = o.new Inner();
        in.javava();
         */

        new Outer().new Inner().javava();


    }
}
