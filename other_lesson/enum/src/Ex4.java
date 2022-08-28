/*. 다음에 제시된 BanNoAscending클래스를 완성하여, ArrayList에 담긴 Student인스턴스들이 반(ban)과 번호(no)로 오름차순 정렬되게 하시오.
        (반이 같은 경우 번호를 비교해서 정렬한다.)*/
// hint : 반(ban)을 뺄셈한 결과가‘0’이면(반이 같으면), 번호(no)를 뺄셈해서 반환하기만 하면 됨!

import java.util.*;
class Student2{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage();
    }


} // class Student
class BanNoAscending implements Comparator<Student2>  {		// java.util 패키지에 속한 인터페이스(API 참고해 볼 것!)
    public int compare(Student2 s1, Student2 s2) {

        if(( s1).ban > ( s2).ban){
                    System.out.println(11);
                    return 1;
                } else if (( s1).ban < ( s2).ban) {
                    return -1;
                }else{
                    System.out.println(112);
                    if(( s1).no > ( s2).no){
                        return 1;
                    } else if (( s1).no < ( s2).no) {
                        return -1;
                    }
                    else return 0;
                }

		/*
			(1) 알맞은 코드를 넣어 완성하시오.
		*/
    }

}

class Ex4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student2("홍동우",2,1,70,90,70));
        list.add(new Student2("홍다은",2,2,60,100,80));
        list.add(new Student2("채혜광",1,3,100,100,100));
        list.add(new Student2("이혜지",1,1,90,70,80));
        list.add(new Student2("이종세",1,2,80,80,90));
        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
//결과
/*
        홍동우,1,1,90,70,80,240,80.0
        홍다은,1,2,80,80,90,250,83.3
        채혜광,1,3,100,100,100,300,100.0
        이혜지,2,1,70,90,70,230,76.7
        이종세,2,2,60,100,80,240,80.0
        */