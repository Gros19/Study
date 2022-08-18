package homework.date02;

/*
2. 다음의 프로그램을 실행하면 어떤 결과가 출력될까요? 또 키위('K')가 출력되도록 수정하시오.
K가 출력됩니다.
public class FruitVendingMachine {
    public static void main( String args[]) {
        char coin = 'K';
        switch (coin) {
            case 'A' :
                System.out.println("사과");
                break;
            case 'P' :
                System.out.println("배");
                break;
            case 'G' :
                System.out.println("포도");
                break;
            case 'K':
                System.out.println("키위");
                break;
            default :
                System.out.println(coin);
                break;
        }
    }
}

(응용문제)
	2.1. 모든 과일이 선택되어 나오도록 수정하시오.
public class FruitVendingMachine {
    public static void main( String args[]) {
        char coin = 'K';
        switch (coin) {
            case 'A' :
                System.out.println("사과");
            case 'P' :
                System.out.println("배");
            case 'G' :
                System.out.println("포도");
            case 'K':
                System.out.println("키위");
                break;
            default :
                System.out.println(coin);
                break;
        }
    }
}

	2.2. 대/소문자 상관없이 p(P)를 입력하면 '배'가 선택되도록 클래스를 작성하시오.
public class FruitVendingMachine {
    public static void main( String args[]) {
        char coin = 'P';

        if(coin > 96 && coin <123){
            coin-=32;
        }
        switch (coin) {
            case 'A' :
                System.out.println("사과");
                break;
            case 'P' :
                System.out.println("배");
                break;
            case 'G' :
                System.out.println("포도");
                break;
            case 'K':
                System.out.println("키위");
                break;
            default :
                System.out.println(coin);
                break;
        }
    }
}
	2.3. 다음의 machine 메서드를 구현해 보시오.(가능한 사람만!!-조장/반장 필수)
	public class FruitVendingMachine {
    public static void main( String args[]) {
        char coin = 'P';
        FruitVendingMachine f = new FruitVendingMachine();
        String str = f.machine(coin);
        System.out.println("자판기 선택 과일 : " + str);

    }
    String machine(char coin){
        if(coin > 96 && coin <123){
            coin-=32;
        }
        switch (coin) {
            case 'A' :
                return "사과";
            case 'P' :
                return "배";
            case 'G' :
                return "포도";
            case 'K':
                return "키위";
            default :
                return "???";
        }

    }
}



 */
public class FruitVendingMachine {
    public static void main( String args[]) {
        char coin = 'P';
        FruitVendingMachine f = new FruitVendingMachine();
        String str = f.machine(coin);
        System.out.println("자판기 선택 과일 : " + str);

    }
    String machine(char coin){
        if(coin > 96 && coin <123){
            coin-=32;
        }
        switch (coin) {
            case 'A' :
                return "사과";
            case 'P' :
                return "배";
            case 'G' :
                return "포도";
            case 'K':
                return "키위";
            default :
                return "???";
        }

    }
}
