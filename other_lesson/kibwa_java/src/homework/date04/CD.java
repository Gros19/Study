package homework.date04;

public class CD extends Item{
    String singer;
    int trackNum;
    String outDate;

    public CD(int itemNo, String title, int price, String singer,int trackNum, String outDate) {
        super(itemNo, title, price);
        this.singer = singer;
        this.trackNum = trackNum;
        this.outDate = outDate;
    }

    public void output(){
        super.output();
        System.out.println("singer: "+singer);
        System.out.println("trackNum: "+trackNum);
        System.out.println("outDate: "+outDate);


    }

    @Override
    public String toString() {
        return "CD{" +
                "singer='" + singer + '\'' +
                ", trackNum=" + trackNum +
                ", outDate='" + outDate + '\'' +
                ", itemNo=" + itemNo +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", state=" + state +
                '}';
    }
}
