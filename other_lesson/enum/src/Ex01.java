import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
1. 다음은 정수집합 1,2,3,4와 3,4,5,6의 교집합, 차집합, 합집합을 구하는 프로그램을 작성하시오
//Hint : ArrayList클래스의 addAll(), removeAll(), retainAll()을 사용하라.
 */
public class Ex01 {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);

        List<Integer> blist = new ArrayList<>();
        blist.add(3);
        blist.add(4);
        blist.add(5);
        blist.add(6);

        alist.retainAll(blist);
        System.out.println("a 교집합 b"+alist);

        List<Integer>clist = new ArrayList<>();
        clist.add(new Integer(1));
        clist.add(new Integer(2));
        clist.add(new Integer(3));
        clist.add(new Integer(4));

        blist.removeAll(alist);
        System.out.println("a 차집합 b"+blist);

        clist.addAll(blist);
        System.out.println("합집합" + clist);

    }
}
