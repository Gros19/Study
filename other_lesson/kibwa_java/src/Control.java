import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("주민등록번호 :");
//        String id = scn.nextLine();
//        char schar = id.charAt(7);
//        if( schar== '1' || schar =='3'){
//            System.out.println("남자");
//        }
//        else if(schar== '2' || schar =='4'){
//            System.out.println("여자");
//        }
//        else{
//            System.out.println("잘못된 입력");
//        }
//        switch (Integer.parseInt(String.valueOf(id.charAt(8)))*10+Integer.parseInt(String.valueOf(id.charAt(9)))){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("서울특별시 출생");
//                break;
//            case 9: case 10:  case 11: case 12:
//                System.out.println("부산광역시 출생");
//                break;
//
//            case 13: case 14: case 15:
//                System.out.println("인천광역시 출생");
//                break;
//            case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25:
//                System.out.println("경기도 출생");
//                break;
//            default:
//                System.out.println("그 외 지역 출생");
//
//        }
//
//
//
//
//
//        Calendar c = Calendar.getInstance();
//        int year  = c.get(Calendar.YEAR);
//
//        /*나이구하기*/
//        String birthStr = id.substring(0, 2);
//        int nai = Integer.parseInt(birthStr);
//        if(schar == '1' || schar =='2'){
//            System.out.println("나이는 " + (year-(1900+nai)));
//        } else if (schar =='3' || schar =='4') {
//            /*제가 잘못 됐던 부분*/
//            System.out.println("나이는 " + (year-(2000+nai)));
//
//        }

        int sum = 1;
        int i=2;
        do{
            sum += i++;
        }
        while(i < 101);
        System.out.println(sum);

    }
}
