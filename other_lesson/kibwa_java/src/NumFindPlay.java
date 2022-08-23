import java.util.Scanner;

public class NumFindPlay {
    /*숫자 맞추기 게임*/
    public static void main(String[] args) {
        /*임의의 1~100 사이 변수를 담기*/
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;
        System.out.println(answer);
        Scanner scn = new Scanner(System.in);

        do{
            System.out.println("1~100 사이의 값을 입력하세요: ");
            input = scn.nextInt();
            count++;

            if(input < answer){
                System.out.println("답 보다 작아요");
            } else if (input > answer) {
                System.out.println("답 보다 커요");
            } else{
                System.out.println("정답입니다!");
                System.out.println("정답까지의 횟수: " + count);
                break;
            }

        }while(true);
    }
}
