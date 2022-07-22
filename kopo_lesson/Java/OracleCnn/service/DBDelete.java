package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBDelete {
	public void doDelete(Map<String, String> pMap) {
		System.out.println("\n\ndoDelete�� �����մϴ�.");
		try {
			
			//����Ŭ�� ����
			Connection conn = DBConn.getDBconnection();
			
			//����Ŭ�� SQL������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;
			
			//SQL����
			String sql = "delete from USER_INFO";
					sql += "where user_id=?";
			
			//����Ŭ�� ���޵� sql������ ����
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0; //?������ �����ϱ� ���� ����
			
			//���޹޴� pMam ��ü�� ���� SQL ������ ?�� �����ϱ�
			
			String user_id = pMap.get("user_id");
			System.out.println("���޹��� user_id :" + user_id);
			pstmt.setString(++idx, user_id);
			
			
			//insert ���� ����
			int res = pstmt.executeUpdate();
			System.out.println("Delete���� ����");
			if(res > 0) {
				System.out.println(user_id+" delete ����!");
			}
			else {
				System.out.println(user_id+" delete ����,,,");
			}
			pstmt = null;
			
			System.out.println("\n\ndoDelete�� �����մϴ�.\n");
			//����Ŭ DB���� ����
			DBConn.DBClose(conn);
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
