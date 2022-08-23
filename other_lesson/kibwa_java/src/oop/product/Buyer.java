package oop.product;

import java.sql.Array;
import java.util.ArrayList;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[3];//구입한 제품을 저장하기 위한 배열
	ArrayList alist = new ArrayList();
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
			System.out.println(product + "을/를 구입하셨습니다.");
		}
		
	}
	
	//summary 메소드 구현
	
	public void summary() {
		int sum = 0;
		for(int j=0;j<i;j++) {
			sum += this.item[j].price;
			System.out.println("제품명 : "+ item[j] +" 가격 : "+item[j].price+" 보너스 : "+item[j].bonusPoint);
		}
		System.out.println("총 가격 : "+sum);
	}
}
