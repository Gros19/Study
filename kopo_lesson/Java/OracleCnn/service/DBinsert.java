package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBinsert {
	public void doInsert(Map<String, String> pMap) {
		System.out.println("\n\ndoInsert를 실행합니다.");
		try {
			
			//오라클에 접속
			Connection conn = DBConn.getDBconnection();
			
			//오라클에 SQL쿼리를 전달하기 위한 객체
			PreparedStatement pstmt = null;
			
			//SQL선언
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR) VALUES (";
			sql += "?, "; //INSERT INTO 구문에서의 첫번째 컬럼인 USER_ID와 매칭됨
			sql += "?, "; //INSERT INTO 구문에서의 두번째 컬럼인 USER_NM와 매칭됨
			sql += "?, "; //INSERT INTO 구문에서의 세번째 컬럼인 EMAIL과 매칭됨
			sql += "?) "; //INSERT INTO 구문에서의 네번째 컬럼인 ADDR와 매칭됨 (REG_DT)는 INSERT INTO 구문에 없어서 제외
			
			//오라클에 전달될 sql쿼리를 저장
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0; //?순번을 지정하기 위한 변수
			
			//전달받는 pMam 객체의 값과 SQL 쿼리의 ?와 대입하기
			
			String user_id = pMap.get("user_id");
			System.out.println("전달받은 user_id :" + user_id);
			pstmt.setString(++idx, user_id);
			
			String user_nm = pMap.get("user_nm");
			System.out.println("전달받은 user_nm :" + user_nm);
			pstmt.setString(++idx, user_nm);
			
			String email = pMap.get("email");
			System.out.println("전달받은 email :" + email);
			pstmt.setString(++idx, email);
			
			String addr = pMap.get("addr");
			System.out.println("전달받은 addr :" + addr);
			pstmt.setString(++idx, addr);
			
			//insert 쿼리 실행
			int res = pstmt.executeUpdate();
			System.out.println("insert쿼리 실행");
			if(res > 0) {
				System.out.println("데이터 insert 성공!");
			}
			else {
				System.out.println("데이터 insert 실패,,,");
			}
			pstmt = null;
			
			System.out.println("\n\ndoInsert를 종료합니다.\n");
			//오라클 DB접속 종료
			DBConn.DBClose(conn);
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
