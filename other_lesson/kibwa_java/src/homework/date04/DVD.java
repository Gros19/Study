package homework.date04;

public class DVD extends Item{
    String actor;
    String runtime;
    String outDate;

    public DVD(int itemNo, String title, int price, String actor, String runtime, String outDate) {
        super(itemNo, title, price);
        this.actor = actor;
        this.runtime = runtime;
        this.outDate = outDate;
    }
    public void output(){
        super.output();
        System.out.println("actor: "+actor);
        System.out.println("runtime: "+runtime);
        System.out.println("outDate: "+outDate);


    }

    @Override
    public String toString() {
        return "DVD{" +
                "actor='" + actor + '\'' +
                ", runtime='" + runtime + '\'' +
                ", outDate='" + outDate + '\'' +
                ", itemNo=" + itemNo +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", state=" + state +
                '}';
    }
}
