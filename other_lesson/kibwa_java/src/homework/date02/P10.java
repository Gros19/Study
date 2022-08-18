package homework.date02;

/*
10.1~30 사이의 숫자를 출력하되 3의 배수는 제외하고 출력하는 프로그램을 작성하시오.(반복문 아무거나)
1 2 4 5 7 8 10 .... 29
 */
public class P10 {

    public static void main(String[] args) {
        for(int i = 1 ; i < 31; i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i +" ");
        }
    }
}
