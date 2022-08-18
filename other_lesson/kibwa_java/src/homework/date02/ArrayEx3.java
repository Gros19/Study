package homework.date02;

public class ArrayEx3 {
    public static void main(String[] args) {
        if (args.length !=3) {
            System.out.println("usage: java ArrayEx2 NUM1 OP NUM2");
            System.exit(0);
        }
        String result;

        switch (args[1]){
            case "+":
                result = String.valueOf(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
                break;
            case "-":
                result = String.valueOf(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
                break;
            case "*":
                result = String.valueOf(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
                break;
            case "/":
                if(Integer.parseInt(args[2]) == 0){
                    result = "0으로 나눌 수 없습니다.";
                    break;
                }
                result = String.valueOf(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
                break;
            default:
                result = "잘못된 입력";


        }

        System.out.println("결과: "+result);
    }
}
