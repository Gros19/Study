package homework.date04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ItemHandler h = new ItemHandler(5);
        Scanner scn = new Scanner(System.in);

        try{
            while(true){
                System.out.println("#####메뉴 선택######");
                System.out.println("1. 아이템 추가");
                System.out.println("2. 정보 출력");
                System.out.println("3. 프로그램 종료");
                System.out.println("-------------------");
                System.out.print("선택: ");

                int choice = scn.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("#####아이템 선택######");
                        System.out.println("1. CD 추가");
                        System.out.println("2. DVD 추가");
                        System.out.println("3. BOOK 추가");
                        System.out.println("-------------------");
                        System.out.print("선택: ");
                        int ichoce = scn.nextInt();
                        h.addItem(ichoce);
                        break;
                    case 2:
                        h.showAllDate();
                        break;
                    case 3:
                        return;

                }

            }

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("숫자를 입력해주세요!!");
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("입력을 다시 확인해주세요!!");
        }
        finally {
            MainTest.main(new String[0]);
        }

    }
}
