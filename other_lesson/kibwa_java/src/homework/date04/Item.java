package homework.date04;

public class Item {
    int itemNo;
    String title;
    int price;

    public Item(int itemNo, String title, int price) {
        this.itemNo = itemNo;
        this.title = title;
        this.price = price;
    }

    public void output(){
        System.out.println("itemNO: "+itemNo);

        System.out.println("title: "+title);

        System.out.println("price: "+price);
    }
}
