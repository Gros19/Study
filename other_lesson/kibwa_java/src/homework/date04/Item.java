package homework.date04;

import static homework.date04.Lendable.STATE_NORMAL;

public class Item {
    int itemNo;
    String title;
    int price;
    int state;

    public Item(int itemNo, String title, int price) {
        this.itemNo = itemNo;
        this.title = title;
        this.price = price;
        state = STATE_NORMAL;
    }

    public void output(){
        System.out.println("itemNO: "+itemNo);

        System.out.println("title: "+title);

        System.out.println("price: "+price);
    }
}
