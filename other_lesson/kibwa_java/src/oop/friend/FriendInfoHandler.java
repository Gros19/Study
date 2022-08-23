package oop.friend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FriendInfoHandler {
    private Friend[] myFriends;
    private int numOfFriends;
    /*


    ArrayList a = new ArrayList<Friend>();
    public String addFriend(Friend newFriend){
        a.add(newFriend);
        return "친구 등록이 완료됐습니다.";
    }
    public String deleteFriend(Friend oldFriend){
        a.remove((Friend)oldFriend);
        return "친구 손절이 완료됐습니다.";
    }
    public String modifyFriend(Friend oldFriend, Friend editFriend){
        a.remove((Friend)oldFriend);
        a.add(editFriend);
        return "친구 수정이 완료됐습니다.";
    }
    public void showFriend(){

    } */


    public FriendInfoHandler(int num){
        myFriends = new Friend[num];
        numOfFriends = 0;
    }


    //배열에 친구 추가 메소드
    private void addFriendInfo(Friend newFriend){
        myFriends[numOfFriends++] = newFriend;
    }

    public void addFriend(int choice){
        String name,phoneNum,addr,work,major;
        Scanner scn = new Scanner(System.in);
        System.out.print("이름: ");
        name = scn.nextLine();
        System.out.print("전화번호: ");
        phoneNum = scn.nextLine();
        System.out.print("주소: ");
        addr = scn.nextLine();
        if(choice==1){
            System.out.print("직업: ");
            work = scn.nextLine();
            addFriendInfo(new HighFriend(name, addr, phoneNum, work));

        }else {
            System.out.print("학과: ");
            major = scn.nextLine();
            addFriendInfo(new UnivFriend(name, addr, phoneNum, major));
        }
        System.out.println("###입력 완료");

    }

    //배열에 친구 삭제 메소드
    private void deleteFriendInfo(Friend oldFriend){
        myFriends[numOfFriends++] = oldFriend;


    }


    //친구배열의 모든 데이터를 출력
    public void showAllData() {
        int i = 1;
        for(Friend a : myFriends){

            if(a == null){
                System.out.println("###조회 완료");
                return;
            }
            System.out.println("\t"+i++);
            a.showData();
        }
    }

    //친구배열의 간단 정보를 출력
    public void showAllSimpleData(){
        int i = 1;
        for(Friend a: myFriends){
            if(a == null){
                System.out.println("###조회 완료");
                return;
            }

            HighFriend highFriend = a instanceof HighFriend ? ((HighFriend) a) : null;
            UnivFriend univFriend = a instanceof UnivFriend ? ((UnivFriend) a) : null;

            System.out.println("\t"+i++);
            a.showBasicInfo();
        }
    }
}
