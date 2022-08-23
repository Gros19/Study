package mathod;

public class MethodEx2 {

    public static void main(String[] args) {
        String str  = "123";
        System.out.println(str +"이 숫자인지?: "+isNumber(str));
        str  = "123fww";
        System.out.println(str +"이 숫자인지?: "+isNumber(str));
        str  = null;
        System.out.println(str +"이 숫자인지?: "+isNumber(str));
    }


    private static boolean isNumber(String str) {
        if(str == null || str.isEmpty()){
            return false;
        }

        for(char c : str.toCharArray()){
            if(c>47&& c<58){
            }else{
                return false;
            }
        }
        return true;
    }

}
