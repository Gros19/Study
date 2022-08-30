<<<<<<< HEAD:other_lesson/kibwa_java/src/homework/date04/item/ItemHandler.java
package homework.date04;

import java.util.Scanner;

public class ItemHandler implements Lendable{
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
            System.out.println("--알 수 없는 입력");
        }
        System.out.println("--입력 완료");
    }

    protected void addItemInfo(Item item){
        myItems[numOfItems++] = item;
    }


    /*대출이 가능한 책들만 조회*/
    protected void showNormalAllDate(){
        System.out.println("<대출 가능한 책 목록>");
        int inum = 0;
        for(Item i : myItems){
            if(i == null){
                System.out.println("--조회가 완료됐습니다.");
                return;
            }
            if(i.state == STATE_NORMAL){
                System.out.println("\t"+ inum++);
                i.output();
            }
        }
    }

    /*대출 중인 책들만 조회*/
    protected void showBORROWEDAllDate(){
        System.out.println("<대출 중인 책 목록>");
        int inum = 0;
        for(Item i : myItems){
            if(i == null){
                System.out.println("--조회가 완료됐습니다.");
                return;
            }
            if(i.state != STATE_NORMAL){
                System.out.println("\t"+ inum++);
                i.output();
            }
        }
    }

    protected void showAllDate(){
        int inum = 0;
        for(Item i : myItems){
            if(i == null){
                System.out.println("--조회가 완료됐습니다.");
                return;
            }
            System.out.println("\t"+ inum++);
            i.output();
        }
    }

    @Override
    public void checkOut(String borrower, String date) {
        Scanner scn = new Scanner(System.in);

        showNormalAllDate();
        System.out.println("--대출할 책 번호를 입력하세요.");
        System.out.print("inum: ");
        int inum = Integer.parseInt(scn.nextLine());
        if(inum < 0 || inum > numOfItems - 1){
            System.out.println("--유효하지 않은 입력입니다.");
        }else{
            System.out.println("--대출을 시작합니다.");
            myItems[inum].state = STATE_BORROWED;
            showBORROWEDAllDate();
        }
    }

    @Override
    public void checkIn() {
        int inum = 0;
        for(Item i : myItems){
            if(i == null){
                System.out.println("--반납이 완료됐습니다.");
                return;
            }
            i.state = STATE_NORMAL;
            System.out.println("--"+i.title + "반납");
        }

    }
}
=======
package homework.date04;

import java.io.*;
import java.util.Scanner;

public class ItemHandler implements Lendable{
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
            System.out.println("--알 수 없는 입력");
        }
        System.out.println("--입력 완료");
    }

    protected void addItemInfo(Item item){
        myItems[numOfItems++] = item;
    }


    /*대출이 가능한 책들만 조회*/
    protected void showNormalAllDate(){
        System.out.println("<대출 가능한 책 목록>");
        int inum = 0;
        for(Item i : myItems){
            if(i == null){
                System.out.println("--조회가 완료됐습니다.");
                return;
            }
            if(i.state == STATE_NORMAL){
                System.out.println("\t"+ inum++);
                i.output();
            }
        }
    }

    /*대출 중인 책들만 조회*/
    protected void showBORROWEDAllDate(){
        System.out.println("<대출 중인 책 목록>");
        int inum = 0;
        for(Item i : myItems){
            if(i == null){
                System.out.println("--조회가 완료됐습니다.");
                return;
            }
            if(i.state != STATE_NORMAL){
                System.out.println("\t"+ inum++);
                i.output();
            }
        }
    }

    protected void showAllDate(){
        int inum = 0;
        for(Item i : myItems){
            if(i == null){
                System.out.println("--조회가 완료됐습니다.");
                return;
            }
            System.out.println("\t"+ inum++);
            i.output();
        }
    }

    /*
     * 대출*/
    @Override
    public void checkOut(String borrower, String date) {
        Scanner scn = new Scanner(System.in);

        showNormalAllDate();
        System.out.println("--대출할 책 번호를 입력하세요.");
        System.out.print("inum: ");
        int inum = Integer.parseInt(scn.nextLine());
        if(inum < 0 || inum > numOfItems - 1){
            System.out.println("--유효하지 않은 입력입니다.");
        }else{
            System.out.println("--대출을 시작합니다.");
            myItems[inum].state = STATE_BORROWED;
            showBORROWEDAllDate();
        }
    }

    /*
    * 반납*/
    @Override
    public void checkIn() {
        int inum = 0;
        for(Item i : myItems){
            if(i == null){
                System.out.println("--반납이 완료됐습니다.");
                return;
            }
            i.state = STATE_NORMAL;
            System.out.println("--"+i.title + "반납");
        }

    }

    public void writeItem() {
        BufferedWriter bw = null;
        try{
            System.out.println("--파일 출력 시작");
           bw = new BufferedWriter(new FileWriter("D:\\Study\\other_lesson\\kibwa_java\\item.txt"));
           for(Item i : myItems){
               System.out.println(i.toString());
               bw.write(i.toString());
               bw.newLine();

           }
           bw.flush();
        }catch (IOException ie){
            System.out.println(ie.getMessage());
            System.out.println(ie.getCause());
            System.out.println(ie.getStackTrace());
        }finally {
            System.out.println("--파일 출력이 완료됐습니다.");

            try{
                bw.close();
            }catch (IOException e){

            }
        }
    }
    public void readItem() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("D:\\Study\\other_lesson\\kibwa_java\\item.txt"));
            System.out.println("--파일 읽기 시작");
            while (true){
                String s = br.readLine();
                if(s == null){
                    break;
                }
                System.out.println(s);
            }
        }catch (IOException ie){
            System.out.println(ie.getMessage());
            System.out.println(ie.getCause());
            System.out.println(ie.getStackTrace());
        }finally {
            System.out.println("--파일 일기가 완료됐습니다.");

        }

    }

}
>>>>>>> Gros:other_lesson/kibwa_java/src/homework/date04/ItemHandler.java
