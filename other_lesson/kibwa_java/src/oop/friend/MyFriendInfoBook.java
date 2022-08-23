package oop.friend;

import java.util.Scanner;

public class MyFriendInfoBook {
    public static void main(String[] args) {
        FriendInfoHandler handler =new FriendInfoHandler(10);
        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("###메뉴 선택###");
            System.out.print("1. 고교정보 저장\n2. 대학 친구 정보 저장\n3. 전체 정보 저장\n4. 기본 정보 출력\n5.프로그램 종료\n선택: ");
            int choice = scn.nextInt();
            switch (choice){
                //고교 정보 저장
                case 1:
                    //대학 친구 저장
                case 2:
                    handler.addFriend(choice);
                    break;
                    //전체 정보 출력
                case 3:
                    handler.showAllData();
                    break;
                    //기본 정보 출력
                case 4:
                    handler.showAllSimpleData();
                    break;
                    //종료
                case 5:
                    System.out.println("프로그램 종료합니다.");
                    return;
            }
        }
    }
}
