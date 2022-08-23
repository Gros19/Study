package oop.product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer computer = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(computer);
		b.buy(audio);
		b.summary();
	}

}
