package Exam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//i인터페이스
//c클래스
public class ListEx {

	public static void main(String[] args) {
		List<String> rList = new LinkedList<String>();
		//ArrayList클래스
		//메모리가 올려져있지 않아
		//이름만 존재?
		//실체가 없다?
		//인터페이스
		rList.add("이협건");
		rList.add("홍길동");
		
		System.out.println("배열의 크기" + rList.size());
		
		for(int i = 0; i< rList.size(); i++) {
			System.out.printf("%d번째 배열 기억공간: %s\n",i,rList.get(i));
		}
		
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String name = (String)it.next();
			//object에서 상속받아 사용하는데 그때 String으로 형변환
			if(name == "이협건")
				System.out.printf("<%s>\n",name);
			else
				System.out.println(name);
		}
			
		
		 

	}

}
