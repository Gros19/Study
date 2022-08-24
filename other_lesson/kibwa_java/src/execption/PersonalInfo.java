package execption;

public class PersonalInfo {
    String name;
    int age;

    public PersonalInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showPersonalInfo(){
        System.out.println();
        System.out.println("PersonalInfo.showPersonalInfo");
        System.out.println();
        System.out.println("이름: "+name);
        System.out.println("나이: "+ age);
    }
}
