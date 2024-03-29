
import java.util.*;

class Student3 implements Comparable<Student3> {
    String name;
    int    ban;
    int    no;
    int    kor;
    int    eng;
    int    math;

    int    total;	// 총점
    int    schoolRank;	// 전교등수

    Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban  = ban;
        this.no   = no;
        this.kor  = kor;
        this.eng  = eng;
        this.math = math;

        total = kor+eng+math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }

    public int compareTo(Student3 s) {
		/*
			(1) 알맞은 코드를 넣어 완성하시오.
		*/
        if(s.total > this.total){
            return 1;
        }else
        return -1;

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
                +","+schoolRank	// 새로 추가
                ;
    }
} // class Student

class Ex5 {
    public static void calculateSchoolRank(List<Student3> list) {
        Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.

        int prevRank = -1;       // 이전 전교등수
        int prevTotal = -1;       // 이전 총점
        int length = list.size();
		for(int i = 0; i< length; i++){
            int jum = list.size();
            for (int j = 0; j < length; j++){
                if(i == j){
                    continue;
                }
                if(list.get(i).total >= list.get(j).total){
                    jum--;
                }
            }
            list.get(i).schoolRank = jum;

        }
		/*
		    (2) 알맞은 코드를 넣어 완성하시오.
	               1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다.
	          	         	1.1 총점(total)이 이전총점(prevTotal)과 같으면 이전 등수(prevRank)를 등수(schoolRank)로 한다.
			1.2 총점이 서로 다르면, 등수(schoolRank)의 값을 알맞게 계산해서 저장한다. 이전에 동점자 였다면, 그 다음 등수는 동점자의 수를 고려해야한다.(실행결과 참고)
			1.3 현재 총점과 등수를 이전총점(prevTotal)과 이전등수(prevRank)에 저장한다.
		*/
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student3("홍동우",2,1,70,90,70));
        list.add(new Student3("홍다은",2,2,60,100,80));
        list.add(new Student3("황도희",1,3,100,100,100));
        list.add(new Student3("김지수",1,1,90,70,80));
        list.add(new Student3("김민석",1,2,80,80,90));

        calculateSchoolRank(list);

        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}

// 결과
/*
        홍동우,1,3,100,100,100,300,100.0,1
        홍다은,1,2,80,80,90,250,83.3,2
        황도희,2,2,60,100,80,240,80.0,3
        김지수,1,1,90,70,80,240,80.0,3
        김민석,2,1,70,90,70,230,76.7,5
 */
