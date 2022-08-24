package execption;

public class NameLengthException extends Exception{
    String ename;
    NameLengthException(String name){
        super("이름의 길이가 맞지 않습니다.");
        this.ename = name;
    }

    //1글자
    //길이가 5글자 초과 - > 17글자
}
