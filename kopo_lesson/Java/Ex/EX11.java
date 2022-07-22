package Exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class EX11 {

	public static void main(String[] args) {
		List<HashMap<String,String>> rList = new ArrayList<>();
		HashMap<String, String> pMap = new HashMap<>();
		pMap.put("1qwe", "1asd");
		pMap.put("2qwe", "2asd");
		pMap.put("3qwe", "3asd");

		rList.add(pMap);
		pMap = null;
		
		pMap = new HashMap<>();
		pMap.put("1qwe", "11qwe");
		pMap.put("2qwe", "22qwe");
		pMap.put("3qwe", "33qwe");
		
		rList.add(pMap);
		pMap = null;
		
		Iterator<HashMap<String, String>> it = rList.iterator();
		while(it.hasNext()) {
			HashMap<String,String> rMap = it.next();
			
			System.out.println(rMap.get("1qwe"));
			System.out.println(rMap.get("2qwe"));
			System.out.println(rMap.get("3qwe"));
			
			System.out.println();
		}
	}

}
