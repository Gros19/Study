package nested;

public class PiggyBank{
    int total;
    Slot slot;

    public PiggyBank(){
        total = 0;
        slot = new Slot();
    }
    class Slot{
        void put(int amount){
            total += amount;
        }
        public void showTotal(){
            System.out.println("총 금액 : "+ total);
        }
    }

    public static void main(String[] args) {

        PiggyBank bank1 = new PiggyBank();
        PiggyBank bank2 = new PiggyBank();
        PiggyBank bank3 = new PiggyBank();

        bank2.slot.put(1000);
        bank3.slot.put(1244);

        bank2.slot.showTotal();
        bank3.slot.showTotal();

    }
}
