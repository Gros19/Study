package homework;


class BoolSuper{
    protected String src;
    public BoolSuper(){ src = "자바"; }
    public BoolSuper(String src){ this.src = src; }
    public boolean result(String dest){
        boolean result = src.equals(dest);
        return result;
    }
    public String getSrc(){ return src; }
}
class BoolSub extends BoolSuper{
    public boolean result(String dest){
        System.out.print(super.result(dest)+"-");
        return (src == dest);
    }
}
public class EqualsTest{
    public static void main(String[] args){
        BoolSuper sub = new BoolSub();
        BoolSuper sup = new BoolSuper();
        String s =  new String("자바");
        System.out.println(sub.result(s));
        System.out.println(sup.result(s));
        System.out.println(sup.getSrc().equals("자바"));
    }
}
