package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.conn.DBConn;

public class DBSelect {
	public static void main(String[] args) throws SQLException {

		//����Ŭ �����ϱ�
		Connection conn = DBConn.getDBconnection();
		
		//����Ŭ�� SQL������ �����ϱ� ���� ������Ʈ
		PreparedStatement pstmt = null;
		
		//SQL ����
		String sql = "select count(1) as cnt from user_info";
		
		//����Ŭ�� ���޵� SQL ������ �����ϱ�
		pstmt = conn.prepareStatement(sql);
		
		//SQL ��ȸ ������ �����ϰ�, rs ��������� �����ϱ�
		//ResultSt ������Ʈ�� MAP �ڷ� ����(Ű�� ������ ����)�� ����Ŭ�� �����ϵ��� ������ �ڹ� ������Ʈ
		ResultSet rs = pstmt.executeQuery(sql);
		
		if (rs.next()) {
			
			String cnt = rs.getString("cnt");
			System.out.println("ȸ�������� �� cnt :" + cnt);
		}
		
		//����Ŭ�κ��� ���޹��� ����� ����� ������ �ٷ� �޸𸮸� �����ؾ���
		//�������� ������ ����Ŭ DB�� ��� ������ �����ǰ� �־� DB�� ������ ������
		rs.close();
		
		//����Ŭ DB ���� ����
		DBConn.DBClose(conn);
	}

}
