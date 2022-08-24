package execption;

public class AgeInputException extends Exception {
    int eAge;
    public AgeInputException(int age) {
        super("유효하지 않은 나이가 입력되었습니다.");
        this.eAge = age;
    }
}
