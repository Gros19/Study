package homework.date03;

import java.util.Arrays;
import java.util.Scanner;

public class ControlFunc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.print("1 int a+b: ");
//        add(scn.nextInt(), scn.nextInt());
//        System.out.print("2 byte a+b: ");
//        System.out.println(add(scn.nextByte(), scn.nextByte()));
//        System.out.print("3 int a-b: ");
//        System.out.println(sub(scn.nextInt(), scn.nextInt()));
//        System.out.print("4 byte 인사: ");
//        select(scn.nextByte());
//        System.out.print("5 char 과일: ");
//        select(scn.next().toLowerCase().charAt(0));
//        System.out.print("6 int 안녕하세요: ");
//        System.out.println("\n반복횟수"+hello(scn.nextInt()));
//        System.out.print("7 int 안녕하세요2: ");
//        System.out.println("\n반복횟수"+hello(scn.nextInt(),scn.next()));
        System.out.print("8 arr 안녕하세요3: ");
        System.out.println("\n공백문자열 기준 자른 배열 크기: "+hello(scn.nextLine().split(" ")));
        String[] arrb = {
                "12312", "123123","12312"
        };
//        System.out.print("9 float 원 넓이 d,p: ");
//        System.out.println("\n : "+count(scn.nextFloat(),scn.nextFloat()));
//        System.out.print("10 int 사각넓이: ");
//        System.out.println("\n : "+count(scn.nextInt(),scn.nextInt()));

            }
    /*
    *
    *   1. 정수형 데이터(int) 2개를 매개변수로 받아서 덧셈 연산을 수행하여 모니터로 결과를 출력하는 메소드
        0.	식별자 : add
        1.	파라미터(input) : 정수형 데이터 2개를 받는다
        2.	메소드 바디 : 덧셈 연산 결과값을 모니터로 출력한다(표준 출력 메소드)
        3.	출력 데이터(output) : 없음
        */
    static void add(int a, int b){
        System.out.println(a+b);
    }
    /*
    2. 정수형 데이터(byte) 2개를 매개변수로 받아서 덧셈 연산을 수행하여 결과값을 반환하는 메소드
    0.	식별자 : add
    1.	파라미터(input) : 정수형 데이터 2개를 받는다
    2.	메소드 바디 : 덧셈 연산 결과값을 정수형 변수에 저장한다
    3.	출력 데이터(output) : 결과값을 출력한다
     */
    static int add(byte a, byte b){
        int sum = a+b;
        return sum;
    }
    /*
    3. 정수형 데이터(int) 2개를 매개변수로 받아서 뺄셈 연산을 수행하여 결과값을 반환하는 메소드
0.	식별자 : sub
1.	파라미터(input) : 정수형 데이터 2개를 받는다
2.	메소드 바디 : (큰수-작은수)의 뺄셈 연산의 결과값을 변수에 저장한다
3.	출력 데이터(output) : 결과값을 출력한다

     */
    static int sub(int a, int b){
        int res = Math.max(a, b) - Math.min(a, b);
        return res;
    }

    /*
    4. 정수형 데이터 1개를 매개변수로 받아서 해당되는 문자열(인사말)을 모니터로 출력하는 메소드
0.	식별자 : select
1.	파라미터(input) : 정수형 데이터 1개를 받는다
2.	메소드 바디 : 입력 받은 데이터의 값에 따라 4종류의 문자열을 표준 출력한다
     (1-굿모닝, 2-굿애프터눈, 3-굿이브닝, 4-방가방가)
3.	출력 데이터(output) : 없음
     */
    static void select(byte i){
        switch (i){
            case 4:
                System.out.println("방가방가");
                break;
            case 1:
                System.out.println("굿모닝");
                break;
            case 2:
                System.out.println("굿애프터눈");
                break;
            case 3:
                System.out.println("굿이브닝");
                break;
        }
    }

    /*
    5. 문자 데이터 1개를 매개변수로 받아서 해당되는 문자열(과일이름)을 모니터로 출력하는 메소드
0.	식별자 : select
1.	파라미터(input) : 문자 데이터 1개를 받는다
2. 메소드 바디 : 입력 받은 데이터의 값에 따라 (대소문자 구분없이) 4종류의 문자열을 표준 출력한다
                (a-사과, b-배, c-포도, 기타-과일)
2.	출력 데이터(output) : 없음
     */
    static void select(char a){
        switch (a){
            case 'a':
                System.out.println("사과");
                break;
            case 'b':
                System.out.println("배");
                break;
            case 'c':
                System.out.println("포도");
                break;
            default:
                System.out.println("기타");

        }
    }

    /*
    6. 반복 출력할 횟수를 매개변수로 받아서 지정된 문장을 모니터로 출력하고, 출력된 횟수를 반환하는 메소드
0.	식별자 : hello
1.	파라미터(input) : 반복 횟수
2.	메소드 바디 : 반복 횟수만큼 “안녕하세요~”라는 문장을 표준 출력한다.(단, for문 사용)
3.	출력 데이터(output) : 반복횟수를 출력한다

     */
    static int hello(int a){
        for(int i = 0; i<a; i++){
            System.out.println("안녕하세요~");
        }
        return a;
    }

    /*
    7. 반복 출력할 횟수와 문자열 내용을 매개변수로 받아서 내용을 모니터로 출력하고, 출력된 횟수를 반환하는 메소드
0.	식별자 : hello
1.	파라미터(input) : 반복 횟수, 출력할 문자열
2.	메소드 바디 : 입력받은 문장을 반복 횟수만큼 표준 출력한다.(단, while문 사용)
3.	출력 데이터(output) : 반복횟수를 출력한다

     */
    static int hello(int a, String s){
        int res = a;
        while(a-- > 0){
            System.out.println(s);
        }
        return res;
    }

    /*
    8. 반복 출력할 횟수를 매개변수로 받아서 지정된 문장을 모니터로 출력하고, 출력된 횟수를 반환하는 메소드
0.	식별자 : hello
1.	파라미터(input) : 출력할 문자열이 저장된 배열
2.	메소드 바디 : 입력받은 문자열의 내용을 표준 출력한다.(단, 향상된 for문 사용)
3.	출력 데이터(output) : 배열 사이즈를 출력한다

     */
    static int hello(String[] arr){
        for(String s : arr){
            System.out.println(s);
        }
        return arr.length;
    }

    /*
    9. 실수형 데이터 2개를 매개변수로 받아서 원이 넓이를 계산한 결과값을 반환하는 메소드
0.	식별자 : count
1.	파라미터(input) : 원의 반지름, 파이값 (단, 음수 데이터는 입력할 수 없다)
2.	메소드 바디 : 원의 넓이를 계산한 결과값을 변수에 저장한다
3.	출력 데이터(output) : 결과값을 출력한다 (음수 데이터 입력오류의 경우 -1을 출력한다)

     */

    static double count(float d, float p){
        if(d < 0 || p < 0){
            return -1;
        }
        double s = Math.pow(d,2) * p;
        return s;
    }

    /*
    10. 정수형 데이터 2개를 매개변수로 받아서 사각형의 넓이를 계산한 결과값을 반환하는 메소드
0.	식별자 : count
1.	파라미터(input) : 가로 길이, 세로 길이 (단, 음수 데이터는 입력할 수 없다)
2.	메소드 바디 : 사각형의 넓이를 계산한 결과값을 변수에 저장한다
3.	출력 데이터(output) : 결과값을 출력한다 (음수 데이터 입력오류의 경우 -1을 출력한다)

     */
    static int count(int a, int b){
        if(a < 0 || b < 0){
            return -1;
        }
        int s = a*b;
        return s;
    }
}
