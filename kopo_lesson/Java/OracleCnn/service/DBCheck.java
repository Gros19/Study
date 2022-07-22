package service;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;

import java.util.*;
import java.sql.*;
import db.conn.DBConn;

public class DBCheck{
	
	public static void main(String[] args) throws SQLException{
		try {
					Scanner scn = new Scanner(System.in);
					Connection conn = DBConn.getDBconnection();
					
					PreparedStatement pstmt = null;
				
					 String sql = "SELECT COUNT(USER_ID) AS CNT FROM USER_INFO";
							sql += " WHERE USER_ID = ?";
					
					pstmt = conn.prepareStatement(sql);
					
					String user_id = scn.nextLine();
					String user_nm = scn.nextLine();
					String email = scn.nextLine();
					String addr = scn.nextLine();
					
					
					pstmt.setString(1, user_id);
					
					ResultSet rs = pstmt.executeQuery();
					
					String count="";
					while(rs.next()) {
					count = rs.getString("CNT");
					}
					
					pstmt = null;
					
					sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR)";
					sql += " VALUES (?, ?, ?, ?)";//공백주의
					
					pstmt = conn.prepareStatement(sql);
					
					if(count.equals("0")) {
						System.out.println("사용할 수 있는 id\n");
						
						pstmt.setString(1, user_id);
						pstmt.setString(2, user_nm);
						pstmt.setString(3, email);
						pstmt.setString(4, addr);
					
						int res = pstmt.executeUpdate();
						
						if(res > 0) System.out.println("데이터 insert 성공!");
						
						else System.out.println("데이터 insert 실패,,,");
					}
					else
						System.out.println("id가 중복되어 insert를 중지합니다.");
					
					pstmt = null;
					DBConn.DBClose(conn);
					
		}catch (Exception e) { 
			System.out.println("이유 : " + e.toString());
			
		}
			

	}
	
}


