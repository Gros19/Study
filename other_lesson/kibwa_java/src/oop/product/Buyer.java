package oop.product;

import java.sql.Array;
import java.util.ArrayList;

public class Buyer {
	int money = 100000;
	int bonusPoint = 0;
	ArrayList<Product> alist = new ArrayList<Product>();//구입한 제품을 저장하기 위한 배열
	int i=0;
	
	//buy메소드 구현
	public void buy(Product product) {
		if(money<product.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		else {
			this.money -= product.price;
			this.bonusPoint += product.bonusPoint;
			alist.add(product);
			System.out.println("현재 잔액: "+this.money);
			System.out.println(product + "을/를 구입하셨습니다.");
			System.out.println(product.price);
			alist.add(product);
		}
		
	}

	public void refund(Product product){
		alist.remove(product);
		System.out.println("제품을 반납했습니다.");
	}
	
	//summary 메소드 구현
	
	public void summary() {
		int sum = 0;
		for(Product p : alist){
			System.out.println("제품명 : " + p + "\n가격 : " + p.price + "\n보너스 : " + p.bonusPoint);
			sum += p.price;
		}
		System.out.println("총 가격 : "+sum);
	}
}
