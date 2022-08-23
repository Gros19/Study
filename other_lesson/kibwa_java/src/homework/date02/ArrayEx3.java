package homework.date02;

public class ArrayEx3 {
    public static void main(String[] args) {
        if (args.length !=3) {
            System.out.println("usage: java ArrayEx2 NUM1 OP NUM2");
            System.exit(0);
        }
        double result = 0;
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[2]);

        switch (args[1]){
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            case "/":
                if(val2 == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                result = val1 / val2;
                break;
            default:
                System.out.println("잘못된 입력");


        }

        System.out.println("결과: "+result);
    }
}
