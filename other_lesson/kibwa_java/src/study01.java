import java.util.ArrayList;
import java.util.Iterator;

public class study01 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<Integer>();
        a.add(234);
        a.add(555);
        a.add(33);

        a.remove((Object) 33);
        Iterator i = a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());



        }
    }
}
