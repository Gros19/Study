package homework.date04;

import java.util.Scanner;

public class ItemHandler {
    private Item[] myItems;
    private int numOfItems;

    protected ItemHandler(int num){
        myItems = new Item[num];
        numOfItems = 0;
    }

    protected void addItem(int choice){
        Scanner scn = new Scanner(System.in);
        System.out.print("itemNo: ");
        int itemNo = Integer.parseInt(scn.nextLine());
        System.out.print("title: ");
        String title = scn.nextLine();
        System.out.print("price: ");
        int price = Integer.parseInt(scn.nextLine());
        if(choice == 1){

            System.out.print("singer: ");
            String singer = scn.nextLine();
            System.out.print("trackNum: ");
            int trackNum = Integer.parseInt(scn.nextLine());
            System.out.print("outDate: ");
            String outDate = scn.nextLine();
            addItemInfo(new CD(itemNo, title, price, singer, trackNum, outDate));
        } else if ( choice == 2) {

            System.out.print("actor: ");
            String actor = scn.nextLine();
            System.out.print("runtime: ");
            String runtime = scn.nextLine();
            System.out.print("outDate: ");
            String outDate = scn.nextLine();
            addItemInfo(new DVD(itemNo, title, price, actor, runtime, outDate));
        } else if (choice == 3) {

            System.out.print("name: ");
            String name = scn.nextLine();
            System.out.print("pageNum: ");
            int pageNum = Integer.parseInt(scn.nextLine());
            System.out.print("outDate: ");
            String outDate = scn.nextLine();
            addItemInfo(new Book(itemNo, title, price, name, pageNum, outDate));
        } else {
            System.out.println("알 수 없는 입력");
        }
        System.out.println("입력 완료");
    }

    protected void addItemInfo(Item item){
        myItems[numOfItems++] = item;
    }



    protected void showAllDate(){
        int inum = 1;
        for(Item i : myItems){
            if(i == null){
                System.out.println("조회가 완료됐습니다.");
                return;
            }
            System.out.println("\t"+ inum++);
            i.output();
        }
    }

}
