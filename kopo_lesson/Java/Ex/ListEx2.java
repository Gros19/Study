package Exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//i인터페이스
//c클래스
public class ListEx2 {

	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		aList.add("asdf");
		aList.add("qwer");
		aList.add("zxcv");
		
		Iterator<String> it = aList.iterator();
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a);
		}
		
		
		 

	}

}
