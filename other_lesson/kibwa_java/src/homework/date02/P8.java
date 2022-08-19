package homework.date02;

import java.util.Scanner;

/*

8. 임의의 수를 발생하여 그 수만큼 다음의 형태로 '*'을 출력하는 프로그램을 작성하시오.(do~while)
******   (6인 발생된 경우)
*****
****
***
**
*
 */
public class P8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        do{
            int in = n;
            while(in-->0){ System.out.print(n); }
            System.out.println();
        }
        while(--n > 0);
    }
}
