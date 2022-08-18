package homework.date01;

public class Exercise9 {
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = (ch > 64 && ch < 91 ) ? ( (char) (ch+32) ) : ch;

        System.out.println("upperCase:"+ch);
        System.out.println("lowerCase:"+lowerCase);
    }
}
