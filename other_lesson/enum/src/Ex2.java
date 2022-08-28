import java.util.*;

/*
// 2번 기능을 다른 Collection Framwork으로 구현(수정, 변경)해도 무관!!!
2. 다음 예제는 HashSet을 이용해서 빙고판 1~30사이의 숫자들로 만든 것인데, 숫자들의
위치가 잘 섞이지 않는다는 문제가 있다. 이러한 문제가 발생하는 이유와 이 문제를 개선
하기 위한 방법을 설명하고, 이를 개선한 새로운 코드를 작성하시오.
(팁:HashSet은 중복을 허용하지 않고 순서를 유지하지 않기 때문에 순서가 고정된 list 인터페이스 구현)

set은 저장된 객체를 인덱스로 관리하지 않는다.
그래서 순서 보장 x
TreeSet은 오름차순으로 자동 정렬
HashSet은 첫번째 테이블 인덱스부터 순차 탐색하면서 출력하는 것이기 때문에 오름차순으로
출력이 됐습니다.
그러나 LinkedHashSet은 저장 순서를 기억하기 때문에 랜덤한 결과가 출력된다.

TreeSet
[1, 2, 4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
HashSet
[1, 2, 4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
LinkedHashSet
[7, 21, 23, 24, 11, 9, 10, 28, 26, 30, 15, 29, 17, 1, 13, 2, 27, 6, 25, 12, 22, 14, 4, 19, 20]
 */
public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Set <Integer> set2 = new HashSet<>();
        Set <Integer> set3 = new LinkedHashSet<>();
        int[][] board = new int[5][5];
        List<Integer> alist = new ArrayList<>();

        for(int i=0; set.size() < 25; i++) {
            int a = (int)(Math.random()*30)+1;
            set.add(a);
            set2.add(a);
            set3.add(a);
        }

        alist.addAll(set);


        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);

        int randI = (int)(Math.random()*5000)+5000;
        int aRandIndex;
        while (randI-- > 0){
            aRandIndex = (int)(Math.random()*25);
            int a = alist.get(aRandIndex);
            int b = alist.get(0);
            alist.set(0,a);
            alist.set(aRandIndex, b);
        }

        Iterator<Integer> it = alist.iterator();

        for(int i=0; i < board.length; i++) {
            for(int j=0; j < board[i].length; j++) {
                board[i][j] = it.next();
                System.out.print((board[i][j] < 10 ? "  " : " ")+ board[i][j]);
            }
            System.out.println();
        }
    } // main
}
