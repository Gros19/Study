package oop.friend;

public class UnivFriend extends Friend{
    String major;

    public UnivFriend(String name, String addr, String phoneNum, String major) {
        super(name, addr, phoneNum);
        this.major = major;
    }

    public void showData(){
        super.showData();
        System.out.println("과: "+ major);
    }
    public void showBasicInfo(){
        System.out.println("이름: " + name);
        System.out.println("전화: "+ phoneNum);
    }
}
