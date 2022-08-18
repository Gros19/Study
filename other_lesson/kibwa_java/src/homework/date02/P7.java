package homework.date02;

import java.util.Scanner;

/*
7. 임의의 단을 발생하여 그 단을 출력하는 프로그램을 작성하시오. (for)
   단, 1 또는 10인 경우 출력에서 제외!
 */
public class P7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        if (d == 1 || d == 10){
            return;
        }
        for(int i = 1; i < 10; i++){
            System.out.println(d+"*"+i+"="+d*i);
        }
    }
}
