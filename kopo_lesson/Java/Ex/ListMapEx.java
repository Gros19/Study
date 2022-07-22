package Exam;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//public class ListMapEx {
//
//	public static void main(String[] args) {
//		List<HashMap<String, String>> rList = new ArrayList<>();
//		
//		HashMap<String, String> pMap = new HashMap<>();
//		
//
//		pMap.put("name", "이협건");
//		pMap.put("email", "h.lee@");
//		pMap.put("addr", "서울");
//		pMap.put("dept", "데분");
//		
//		
//		rList.add(pMap);
//		pMap = null;
//		
//		pMap = new HashMap<>();
//		pMap.put("name", "강낭콩");
//		pMap.put("email", "G.Cho@");
//		pMap.put("addr", "경주");
//		pMap.put("dept", "문");
//		
//		rList.add(pMap);
//		pMap = null;
//		
//		Map<String, String> tMap = (Map<String, String>)rList.get(0);
//		System.out.println(tMap.get("name"));
//		
//		Iterator<HashMap<String, String>> it = rList.iterator();
//		while(it.hasNext()) {
//			HashMap<String, String> rMap = it.next();
//			
//			System.out.println("###### 반복시작! ######");
//			System.out.println("name: "+ rMap.get("name"));
//			System.out.println("email: "+ rMap.get("email"));
//			System.out.println("addr: "+ rMap.get("addr"));
//			System.out.println("dept: "+ rMap.get("dept"));
//			rMap = null;
//			
//			System.out.println("###### 수업 끝! ######");
//			
//		}
//	}
//
//}
//


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class ListMapEx {

   public static void main(String[] args) {
      //HasMap를 저장하기 위한 List 컬렉션 객체를 메모르에 생성
      List<HashMap<Integer, String>> rList = new ArrayList<>();
      
      HashMap<Integer, String> pMap = new HashMap<>();
      
      pMap.put(1, "이협건");
      pMap.put(2, "h,lee@");
      pMap.put(3, "서울");
      pMap.put(4, "데분");
      
      //이협건 정보가 저장된 HasMap 객체를 List 객체에 저장
      rList.add(pMap);
      
      //이협건 정보저장으로 인해 사용이 끝난 HasMap 변수 메모라에서 삭제
      pMap = null;
      
      //홍길동 정보를 저장하기 위해 기존 HasMap 변수에 새롭게 메모리에 올림
      pMap = new HashMap<>();
      
      pMap.put(1, "홍길동");
      pMap.put(2, "g.hong@");
      pMap.put(3, "경기");
      pMap.put(3, "시각");
      
      //이협건 정보가 저장된 HasMap 객체를 List객체에 저장
      rList.add(pMap);
      
      //이협건 정보저장으로 인해 사용이 끝난 HasMap 변수 메모리에서 삭제
      pMap = null;
      
      Iterator<HashMap<Integer, String>> it = rList.iterator();
      while (it.hasNext()) {
      HashMap<Integer, String> rMap = it.next();
      
      System.out.println("######### 반복시작 !! ##########");
      System.out.println("1 :"+ rMap.get(1));
      System.out.println("2 :"+ rMap.get(2));
      System.out.println("3 :"+ rMap.get(3));
      System.out.println("4 :"+ rMap.get(4));
      
      // HasMap 변수 메모리에서 삭제
      rMap = null;
      System.out.println("######### 반복끝 !! ############");
      }
      
      
   }

}
