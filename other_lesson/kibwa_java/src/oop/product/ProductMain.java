package oop.product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv tv = new Tv(5000);
		Tv tv2 = new Tv(1234);
		Computer computer = new Computer(1234);
		Audio audio = new Audio(1234);
		
		b.buy(tv);
		b.buy(computer);
		b.buy(audio);
		b.summary();
		System.out.println("------------------");
		b.refund(tv);
		b.summary();
	}

}
