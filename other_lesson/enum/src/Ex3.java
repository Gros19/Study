/*3. 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서
이름(name)이 기본 정렬기준이 되도록 하시오.
https://velog.io/@susan9905/%EC%A0%95%EB%A0%AC-%EB%AC%B8%EC%A0%9C
*/

import java.util.*;
// Comparable인터페이스 : java.lang 패키지 내

class Student implements Comparable<Student3> {		// 수정
    String name;
    int    ban;
    int    no;
    int    kor;
    int    eng;
    int    math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban  = ban;
        this.no   = no;
        this.kor  = kor;
        this.eng  = eng;
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
                +","+getAverage()
                ;
    }


    @Override
    public int compareTo(Student3 o) {
        return this.name.compareTo(o.name);
    }
}

class Ex3 {
    public static void main(String[] args) {
        List<Student3> list = new ArrayList<Student3>();
        list.add(new Student3("홍동우",1,1,100,100,100));
        list.add(new Student3("홍다은",1,2,90,70,80));
        list.add(new Student3("신영범",1,3,80,80,90));
        list.add(new Student3("박희철",1,4,70,90,70));
        list.add(new Student3("차건담",1,5,60,100,80));
        for(Student3 s: list){
            System.out.println(s.name);
        }

        Collections.sort(list);

        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}

/*
// 결과
홍동우,1,3,80,80,90,250,83.3
홍다은,1,2,90,70,80,240,80.0
신영범,1,5,60,100,80,240,80.0
박희철,1,4,70,90,70,230,76.7
차건담,1,1,100,100,100,300,100.0
 */
