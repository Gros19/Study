package execption;

import java.util.Scanner;

public class UserDefineException {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {



        try{
            int age = readAge();
            System.out.println("당신은 " + age + "세 입니다.");

            String name = readName();
            System.out.println("당신의 이름은 "+ name + "입니다.");

            System.out.println("-------------------------");
            PersonalInfo personalInfo = new PersonalInfo(name, age);
            personalInfo.showPersonalInfo();
        }catch (AgeInputException e){
            System.out.println("잘못된 나이 : " + "'"+e.eAge+"'");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }catch (NameLengthException ne){
            System.out.println("잘못된 이름 : " + "'"+ne.ename+"'");
            System.out.println(ne.getMessage());
            System.out.println(ne.getStackTrace());
        }catch (NotAgeException iMe){
            System.out.println("잘못된 입력" + "'"+iMe.str+"'");
            System.out.println(iMe.getMessage());
            System.out.println(iMe.getStackTrace());
        }
    }

    public static int readAge() throws AgeInputException, NotAgeException{

        int age = 0;
        String sIn = "";

        System.out.print("나이를 입력하세요.:");
        try {
            sIn = scn.nextLine();
            age = Integer.parseInt(sIn);
        }
        catch (NumberFormatException e){
           throw new NotAgeException(sIn);
        }

        if(age < 0 || age > 140) {
//            AgeInputException expt = new AgeInputException();
            throw new AgeInputException(age);
        }
        return age;
    }

    public static String readName() throws NameLengthException {
        Scanner scn = new Scanner(System.in);
        String name= "";

        System.out.println("이름을 입력해주세요.");
        name = scn.nextLine();

        if(name.length() < 2 || name.length() > 17){
            throw new NameLengthException(name);
        }

        return name;
    }
}
