package oop.friend;

public class HighFriend extends Friend{
    String work;

    public HighFriend(String name, String addr, String phoneNum, String work) {
        super(name, addr, phoneNum);
        this.work = work;
    }
    public void showData(){
        super.showData();

        System.out.println("직업: "+ work);
    }

    public void showBasicInfo(){
        System.out.println("이름: " + name);
        System.out.println("전화: "+ phoneNum);
    }
}
