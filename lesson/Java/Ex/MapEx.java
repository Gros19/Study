package Exam;
import java.util.*;
public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> pMap = new HashMap<>();
		pMap.put("name","±èº¸±Ô");
		pMap.put("e","kjj@234.com");
		pMap.put("num","1243123");
		
		System.out.println("------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("e"));
		System.out.println(pMap.get("num"));
		System.out.println(pMap.get("asdf"));
		System.out.println("------------------");
	}

}
