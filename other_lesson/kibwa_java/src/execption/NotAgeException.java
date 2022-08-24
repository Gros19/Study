package execption;


public class NotAgeException extends NumberFormatException {
    String str;
    public NotAgeException(String s) {
        super("입력한 나이를 숫자로 변환할 수 없습니다.");
        this.str = s;
    }
}
