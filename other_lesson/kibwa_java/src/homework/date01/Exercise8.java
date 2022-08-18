package homework.date01;

public class Exercise8 {
    public static void main(String[] args) {

        char ch = 'z';
        boolean b =     (ch > 47 && ch < 58)? true :
                        (ch > 64 && ch < 91)? true :
                        (ch > 96 && ch <123)? true : false;

        System.out.println(b);
    }
}
