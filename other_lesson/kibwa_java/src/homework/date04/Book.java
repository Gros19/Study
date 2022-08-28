package homework.date04;

public class Book extends Item{

    String name;
    int pageNum;
    String outDate;

    public Book(int itemNo, String title, int price, String name, int pageNum, String outDate) {
        super(itemNo, title, price);
        this.name = name;
        this.pageNum = pageNum;
        this.outDate = outDate;
    }

    public void output(){
        super.output();
        System.out.println("name: "+name);
        System.out.println("pageNum: "+pageNum);
        System.out.println("outDate: "+outDate);


    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNum=" + pageNum +
                ", outDate='" + outDate + '\'' +
                ", itemNo=" + itemNo +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", state=" + state +
                '}';
    }
}
