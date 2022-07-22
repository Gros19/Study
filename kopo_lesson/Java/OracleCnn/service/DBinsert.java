package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBinsert {
	public void doInsert(Map<String, String> pMap) {
		System.out.println("\n\ndoInsert�� �����մϴ�.");
		try {
			
			//����Ŭ�� ����
			Connection conn = DBConn.getDBconnection();
			
			//����Ŭ�� SQL������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;
			
			//SQL����
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR) VALUES (";
			sql += "?, "; //INSERT INTO ���������� ù��° �÷��� USER_ID�� ��Ī��
			sql += "?, "; //INSERT INTO ���������� �ι�° �÷��� USER_NM�� ��Ī��
			sql += "?, "; //INSERT INTO ���������� ����° �÷��� EMAIL�� ��Ī��
			sql += "?) "; //INSERT INTO ���������� �׹�° �÷��� ADDR�� ��Ī�� (REG_DT)�� INSERT INTO ������ ��� ����
			
			//����Ŭ�� ���޵� sql������ ����
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0; //?������ �����ϱ� ���� ����
			
			//���޹޴� pMam ��ü�� ���� SQL ������ ?�� �����ϱ�
			
			String user_id = pMap.get("user_id");
			System.out.println("���޹��� user_id :" + user_id);
			pstmt.setString(++idx, user_id);
			
			String user_nm = pMap.get("user_nm");
			System.out.println("���޹��� user_nm :" + user_nm);
			pstmt.setString(++idx, user_nm);
			
			String email = pMap.get("email");
			System.out.println("���޹��� email :" + email);
			pstmt.setString(++idx, email);
			
			String addr = pMap.get("addr");
			System.out.println("���޹��� addr :" + addr);
			pstmt.setString(++idx, addr);
			
			//insert ���� ����
			int res = pstmt.executeUpdate();
			System.out.println("insert���� ����");
			if(res > 0) {
				System.out.println("������ insert ����!");
			}
			else {
				System.out.println("������ insert ����,,,");
			}
			pstmt = null;
			
			System.out.println("\n\ndoInsert�� �����մϴ�.\n");
			//����Ŭ DB���� ����
			DBConn.DBClose(conn);
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
