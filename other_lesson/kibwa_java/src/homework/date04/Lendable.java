package homework.date04;

public interface Lendable {
    /**대출 중*/
    final static byte STATE_BORROWED = 1;
    /**대출 가능*/
    final static byte STATE_NORMAL = 0;

    void checkOut(String borrower, String date);
    void checkIn();


}
