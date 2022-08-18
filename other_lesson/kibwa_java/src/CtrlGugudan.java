import java.util.Scanner;

public class CtrlGugudan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dan = scn.nextInt() ;
        for(int i = 1; i<10; i++){
            System.out.println(dan +"*"+i+"="+dan*i);
        }
    }
}
