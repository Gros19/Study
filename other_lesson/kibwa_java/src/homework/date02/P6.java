package homework.date02;

import java.util.Scanner;

/*
6. 임의로 발생된 10~100점 사이의 점수로 다음의 메세지를 출력하기 위한 프로그램을 작성하시오.(switch)
   점수가 100점이면 선물이 자전거, TV, 노트북, 냉장고, 만년필입니다.
           90점이면 선물이 TV, 노트북, 냉장고, 만년필입니다.
	   80점이면 선물이 노트북, 냉장고, 만년필입니다.
	   70점이면 선물이 냉장고, 만년필입니다.
	   그외 점수이면 선물이 만년필입니다.
   출력예) 당신의 점수는 80이고, 선물은 노트북, 냉장고, 만년필입니다.


 */
public class P6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        switch (num){
            case 100:
                System.out.println(" 자전거, TV, 노트북, 냉장고, 만년필입니다.");
                break;
            case 90:
                System.out.println("TV, 노트북, 냉장고, 만년필입니다.");
                break;
            case 80:
                System.out.println("노트북, 냉장고, 만년필입니다.");
                break;
            case 70:
                System.out.println("냉장고, 만년필입니다.");
                break;
            default:
                System.out.println("만년필입니다.");
        }
    }
}
