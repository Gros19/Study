package service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintUserInfo {

	public static void main(String[] args) throws SQLException {
		// 입력받는 값을 전달하기 위해 객체 생성
		Map<String, String> pMap = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
	   System.out.println("회원정보출력을 시작합니다.\n\n");
	   System.out.println("다음 중 하나를 고르세요.\n1.insert\n2.delete\n3.update\n4.check and insert");
	   int choice_query = sc.nextInt();
	  
	   
	   System.out.println("==============================");
	   System.out.println("회원아이디를 입력하시오 : ");
	   pMap.put("user_id", sc.next());
	   
	   if(choice_query != 2) //delete일 때 user_id만 받기 위함
	   {
		System.out.println("==============================");
		System.out.println("회원이름을 입력하시오 : ");
		pMap.put("user_nm", sc.next());

		System.out.println("==============================");
		System.out.println("이메일을 입력하시오 : ");
		pMap.put("email", sc.next());

		System.out.println("==============================");
		System.out.println("주소를 입력하시오 : ");
		pMap.put("addr", sc.next());
	   }
	   sc.close();
		

		switch(choice_query) {
		case 1:
		{
//			 DB에 등록을 위한 객체를 메모리에 올림
			   DBinsert dbI = new DBinsert();
//				 DB등록을 위한 함수 호출
			   dbI.doInsert(pMap);
			break;
			}
		case 2:
		{
//			 DB에 등록을 위한 객체를 메모리에 올림
			   DBDelete dbD = new DBDelete();
//				 DB등록을 위한 함수 호출
			   dbD.doDelete(pMap);
			break;
			}
		case 3:
		{
//			 DB에 update할 객체를 메모리에 올림
			DBUpdate dbU = new DBUpdate();
//			// DB변경을 위한 함수 호출
			dbU.doUpdate(pMap);
			break;
			}
		case 4:{
			DBCheck cdbI = new DBCheck();
			cdbI.CheckDoInsert(pMap);
			break;
		}
			
		}



		// 사용이 끝나면 메모리 비우기
		pMap = null;

		// 회원 정보를 가져오기 위해 DBUserInfo 객체를 메모리에 올림
		DBUserInfo ui = new DBUserInfo();

		// 회원 정보 가져오기
		List<Map<String, String>> rList = ui.getUserInfo();

		System.out.println("\n\n회원정보출력을 종료합니다.\n\n");


	}


}