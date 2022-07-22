package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBUpdate {
	public void doUpdate(Map<String, String> pMap) {
		System.out.println("\n\ndoUpdate를 실행합니다.");
		try {
			
			//오라클에 접속
			Connection conn = DBConn.getDBconnection();
			
			//오라클에 SQL쿼리를 전달하기 위한 객체
			PreparedStatement pstmt = null;
			
			//SQL선언
			String sql = "update user_info set email = 'Need to update'";
			sql += " where user_id = ?";
			
			//오라클에 전달될 sql쿼리를 저장
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0; //?순번을 지정하기 위한 변수
			
			//전달받는 pMam 객체의 값과 SQL 쿼리의 ?와 대입하기
			
			String user_id = pMap.get("user_id");
			System.out.println("전달받은 user_id :" + user_id);
			pstmt.setString(++idx, user_id);
			
			
			
			//insert 쿼리 실행
			int res = pstmt.executeUpdate();
			System.out.println("Update쿼리 실행");
			if(res > 0) {
				System.out.println("데이터 Update 성공!");
			}
			else {
				System.out.println("데이터 Update 실패,,,");
			}
			pstmt = null;
			
			System.out.println("\n\noUpdate를 종료합니다.\n");
			//오라클 DB접속 종료
			DBConn.DBClose(conn);
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
