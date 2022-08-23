package oop.lend;

public class SeparateVolume_impl implements Lendable{

    String requestNo, bookTitle, writer, borrower, checkoutDate;
    /*대출 상태*/
    byte state;

    public SeparateVolume_impl(String requestNo, String bookTitle, String writer) {
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }

    /*책을 대출
    * param 대출자, 대출일자*/
    @Override
    public void checkOut(String borrower, String date) {
        if(state != STATE_NORMAL){
            System.out.println("현재 대출중인 책입니다.");
            return;
        }
        this.borrower = borrower;
        this.checkoutDate = date;
        state = STATE_BORROWED;
        System.out.println("- " + bookTitle +"(이)가 "+ borrower+ "에게 대출 됐습니다.");
    }

    @Override
    public void checkIn() {
        if(state == STATE_NORMAL){
            System.out.println("현재 대출이력이 없는 책입니다.");
            return;
        }
        System.out.println("+ " + bookTitle +"(이)가 반납 됐습니다.");
        this.borrower = "";
        this.checkoutDate = "";
        state = STATE_NORMAL;
    }


    Lendable[] arr = new Lendable[3];

}
