package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBUpdate {
	public void doUpdate(Map<String, String> pMap) {
		System.out.println("\n\ndoUpdate�� �����մϴ�.");
		try {
			
			//����Ŭ�� ����
			Connection conn = DBConn.getDBconnection();
			
			//����Ŭ�� SQL������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;
			
			//SQL����
			String sql = "update user_info set email = 'Need to update'";
			sql += " where user_id = ?";
			
			//����Ŭ�� ���޵� sql������ ����
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0; //?������ �����ϱ� ���� ����
			
			//���޹޴� pMam ��ü�� ���� SQL ������ ?�� �����ϱ�
			
			String user_id = pMap.get("user_id");
			System.out.println("���޹��� user_id :" + user_id);
			pstmt.setString(++idx, user_id);
			
			
			
			//insert ���� ����
			int res = pstmt.executeUpdate();
			System.out.println("Update���� ����");
			if(res > 0) {
				System.out.println("������ Update ����!");
			}
			else {
				System.out.println("������ Update ����,,,");
			}
			pstmt = null;
			
			System.out.println("\n\noUpdate�� �����մϴ�.\n");
			//����Ŭ DB���� ����
			DBConn.DBClose(conn);
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
