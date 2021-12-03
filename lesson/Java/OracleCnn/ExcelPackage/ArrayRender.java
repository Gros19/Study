package ExcelPackage;

import java.util.Scanner;

public class ArrayRender {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String arr[];
		arr = str.split(",",8);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].replace("\"", "");
			arr[i] = arr[i].replace("\\", "");
			System.out.println("// row["+i+"] = "+arr[i]);
		}
	}
	
}
