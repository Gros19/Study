package homework.date02;

/*
5. 다음 형식으로 출력되도록 프로그램하시오.
1까지의 합 : 1
2까지의 합 : 3
3까지의 합 : 6
 .....
10까지의 합 : 55
 */
public class P5 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i< 11; i++){
            sum += i;
            System.out.println(i+"까지의 합: " + sum);

        }
    }
}
