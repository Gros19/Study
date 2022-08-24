package homework;
import java.io.IOException;
class SuperClass{
    private int a, b, c;
    public void a() throws IOException { a= 10; throw new IOException(); }
    public void b() throws IOException { b= 20; throw new IOException(); }
    public void c() throws IOException { c= 30; throw new IOException(); }
    public String toString(){
        return ("합계: " + a);
    }
}

class SubClass extends SuperClass{
    public void c() throws java.io.IOException{ throw new java.io.IOException(); }
}

public class InheritanceTest{
    public static void main(String[] args) throws IOException {

        SuperClass s = new SubClass();
        System.out.println(s);

    }
}

