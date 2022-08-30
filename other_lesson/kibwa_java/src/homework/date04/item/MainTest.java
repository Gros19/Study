package homework.date04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        itemhandler h = new itemhandler(5);
        Scanner scn = new Scanner(System.in);

        try{
            while(true){
                System.out.println("#####메뉴 선택######");
                System.out.println("1. 아이템 추가");
                System.out.println("2. 정보 출력");
                System.out.println("3. 프로그램 종료");
                System.out.println("4. 아이템 대출");
                System.out.println("5. 아이템 반납");
                System.out.println("6. 대출 중인 책 목록 출력");
                System.out.println("7. 대출 가능한 책 목록 출력");
                System.out.println("-------------------");
                System.out.print("선택: ");

                int choice = Integer.parseInt(scn.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("#####아이템 선택######");
                        System.out.println("1. CD 추가");
                        System.out.println("2. DVD 추가");
                        System.out.println("3. BOOK 추가");
                        System.out.println("-------------------");
                        System.out.print("선택: ");
                        int ichoce = Integer.parseInt(scn.nextLine());
                        h.addItem(ichoce);
                        break;
                    case 2:
                        h.showAllDate();
                        break;
                    case 3:
                        return;

                        /*대출*/
                    case 4:
                        System.out.print("대출자: ");
                        String borrower = scn.nextLine();
                        System.out.print("대출일: ");
                        String outDate = scn.nextLine();
                        h.checkOut(borrower, outDate);
                        break;
                        /*반납*/
                    case 5:
                        h.checkIn();
                        break;
                    case 6:
                        h.showBORROWEDAllDate();
                        break;
                    case 7:
                        h.showNormalAllDate();
                        break;

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
