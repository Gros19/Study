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
//		pMap.put("name", "������");
//		pMap.put("email", "h.lee@");
//		pMap.put("addr", "����");
//		pMap.put("dept", "����");
//		
//		
//		rList.add(pMap);
//		pMap = null;
//		
//		pMap = new HashMap<>();
//		pMap.put("name", "������");
//		pMap.put("email", "G.Cho@");
//		pMap.put("addr", "����");
//		pMap.put("dept", "��");
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
//			System.out.println("###### �ݺ�����! ######");
//			System.out.println("name: "+ rMap.get("name"));
//			System.out.println("email: "+ rMap.get("email"));
//			System.out.println("addr: "+ rMap.get("addr"));
//			System.out.println("dept: "+ rMap.get("dept"));
//			rMap = null;
//			
//			System.out.println("###### ���� ��! ######");
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
      //HasMap�� �����ϱ� ���� List �÷��� ��ü�� �޸𸣿� ����
      List<HashMap<Integer, String>> rList = new ArrayList<>();
      
      HashMap<Integer, String> pMap = new HashMap<>();
      
      pMap.put(1, "������");
      pMap.put(2, "h,lee@");
      pMap.put(3, "����");
      pMap.put(4, "����");
      
      //������ ������ ����� HasMap ��ü�� List ��ü�� ����
      rList.add(pMap);
      
      //������ ������������ ���� ����� ���� HasMap ���� �޸�󿡼� ����
      pMap = null;
      
      //ȫ�浿 ������ �����ϱ� ���� ���� HasMap ������ ���Ӱ� �޸𸮿� �ø�
      pMap = new HashMap<>();
      
      pMap.put(1, "ȫ�浿");
      pMap.put(2, "g.hong@");
      pMap.put(3, "���");
      pMap.put(3, "�ð�");
      
      //������ ������ ����� HasMap ��ü�� List��ü�� ����
      rList.add(pMap);
      
      //������ ������������ ���� ����� ���� HasMap ���� �޸𸮿��� ����
      pMap = null;
      
      Iterator<HashMap<Integer, String>> it = rList.iterator();
      while (it.hasNext()) {
      HashMap<Integer, String> rMap = it.next();
      
      System.out.println("######### �ݺ����� !! ##########");
      System.out.println("1 :"+ rMap.get(1));
      System.out.println("2 :"+ rMap.get(2));
      System.out.println("3 :"+ rMap.get(3));
      System.out.println("4 :"+ rMap.get(4));
      
      // HasMap ���� �޸𸮿��� ����
      rMap = null;
      System.out.println("######### �ݺ��� !! ############");
      }
      
      
   }

}
