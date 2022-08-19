import java.util.Scanner;

public class RCP {
    public static void input(String man, String woman){
        Scanner scn = new Scanner(System.in);
        while (true){
            System.out.println("가위 바위 보 중에 하나를 입력하세요");
            System.out.print("A: ");
            man = scn.nextLine();
            if(man.equals("가위")||man.equals("보")||man.equals("바위")){
                break;
            }
            System.out.println("다시 입력해주세요.");

        }


        while (true){
            System.out.print("B: ");

            woman = scn.nextLine();
            if(woman.equals("가위")||woman.equals("보")||woman.equals("바위")){
                break;
            }
            System.out.println("다시 입력해주세요.");
        }
    }
    public static void main(String[] args) {
        String man = "";
        String woman = "";

        input(man, woman);



        if(man.equals("가위")&&woman.equals("보")||man.equals("보")&&woman.equals("바위")||man.equals("바위")&&woman.equals("가위")){
            System.out.println("A가 이겼습니다.");
        } else if (man.equals(woman)) {
            System.out.println("비겼습니다.");
            input(man, woman);
        }else {
            System.out.println("B가 이겼습니다.");
        }


    }
}
