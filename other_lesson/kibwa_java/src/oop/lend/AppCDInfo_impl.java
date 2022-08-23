package oop.lend;

public class AppCDInfo_impl extends CDInfo_abs implements Lendable{

    String borrower, checkOutDate;
    byte state;
    public AppCDInfo_impl(String registerNo, String title) {
        super(registerNo, title);
    }

    @Override
    public void checkOut(String borrower, String date) {
        if(state != STATE_NORMAL){
            System.out.println("현재 대출중인 책입니다.");
            return;
        }
        this.borrower = borrower;
        this.checkOutDate = date;
        System.out.println("-"+title+"(이)가 "+ borrower+"에게 대출 됐습니다.");
        state = STATE_BORROWED;
    }

    @Override
    public void checkIn() {
        this.borrower = "";
        this.checkOutDate = "";
        System.out.println(title + "(이)가 " + "반납이 완료 됐습니다.");
        state = STATE_NORMAL;

    }
}
