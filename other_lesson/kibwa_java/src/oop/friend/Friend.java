package oop.friend;

public class Friend {
    String name;
    String addr;
    String phoneNum;

    public Friend(String name, String addr, String phoneNum) {
        this.name = name;
        this.addr = addr;
        this.phoneNum = phoneNum;
    }

    public void showData(){
        System.out.println("이름: "+ name);
        System.out.println("전화: "+ phoneNum);
        System.out.println("주소: "+ addr);
    }

    public void showBasicInfo(){
        System.out.println("이름: " + name);
        System.out.println("전화: "+ phoneNum);
    }
}
