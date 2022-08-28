import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//6. Calendar클래스와 SimpleDateFormat클래스를 이용해서 2010년의 매월 두 번째 일요일의 날짜를 출력하시오.
public class Ex6 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat();
//        sdf.format()

        for(int i = 0; i < 12; i++){
            cal.set(2010,i,1);
            while (cal.get(cal.DAY_OF_WEEK) != 1){
                cal.add(cal.DATE,1);
            }
            System.out.print(cal.get(Calendar.YEAR));
            System.out.print(cal.get(Calendar.MONTH));
            System.out.print(cal.get(Calendar.DATE)+"\t");
            cal.add(cal.DATE,7);
            System.out.print("@@@");
            System.out.print(cal.get(Calendar.YEAR));
            System.out.print(cal.get(Calendar.MONTH)+1);
            System.out.println(cal.get(Calendar.DATE));
        }
    }
}
