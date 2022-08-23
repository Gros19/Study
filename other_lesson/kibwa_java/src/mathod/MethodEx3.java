package mathod;

import java.util.Calendar;
import java.util.Scanner;

public class MethodEx3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요: ");

        String id = scn.nextLine();
        String sex = parseSex(id);
        System.out.println("성별: " + sex);

        String birth = area(id);
        System.out.println("출신 지역: " + birth);

        String ageYear = id.substring(0,2);
        char sexInfo = id.charAt(7);
        System.out.println("나이 : " + calAge(ageYear, sexInfo));
    }

    private static int calAge(String ageYear, char sexInfo) {
        Calendar c = Calendar.getInstance();
        int thisY = c.get((Calendar.YEAR));
        System.out.println(thisY+"올해");

        int yourY = Integer.parseInt(ageYear);
        System.out.println(yourY+"나");
        if(sexInfo =='1' || sexInfo == '2'){
            return thisY - (1900+yourY)+1;
        } else if (sexInfo =='4' || sexInfo == '3') {
            return thisY - (2000+yourY)+1;
        }else return 0;

    }

    private static String area(String id) {
        int chul = Integer.parseInt(id.substring(8,10));
        if(chul >= 0 && chul <=8 ){
            return "서울";
        } else if (chul >= 13 && chul <=15 ) {
            return "인천";
        }else if (chul >= 19 && chul <=25 ) {
            return "경기도의 비 주요도시";
        }
        else if (chul >= 35 && chul <=39 ) {
            return "충청북도";
        }
        else if (chul >= 48 && chul <=54 ) {
            return "전라북도";
        }
        else if (chul >= 67 && chul <=90 ) {
            return "경상도";
        }
        else if (chul >= 9 && chul <=12 ) {
            return "부산";
        }
        else if (chul >= 16 && chul <=18 ) {
            return "경기도 주요 도시";
        }
        else if (chul >= 26 && chul <=34 ) {
            return "강원도";
        }
        else if (chul >= 40 && chul <=47 ) {
            return "충청남도";
        }
        else if (chul >= 55 && chul <=66 ) {
            return "전라남도";
        }else{
            return "지정되지 않음";
        }
    }

    private static String parseSex(String id) {
        int n = id.charAt(7)-48;
        System.out.println(n);
        if(n == 1 || n == 3) {
            return "남";
        } else if (n == 2 || n ==4) {
            return "녀";
        }
        return "지정되지 않음";

    }
}
