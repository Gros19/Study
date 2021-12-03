package db.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbTest {

	public static void main(String[] args) throws SQLException {
		/* Exception�� ����ó����� ���̰� �� ����� �ΰ���
		  1. try & catch
		  2. SQLExeption
		 
		SQLExeption
		
		������ ������
		�� ���� �Լ� ������ ������ �߻��ϸ� catch�� ������ SQLException�� �Ѱܼ� ó��
		���� ���Ͽ��� ������ �߻��ϸ� �ߺ� ó���� ������ �ʾ� ���ϰ�
		���� ���� ��
		�������� �޸� ������ �� ����
		
		try & catch
		
		�������� ���� ó����
		try catch�� ������ ������ �޸� ������ ���� ��
		�׷��� �ΰ� ���� ��
		
		*/ 
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//jdbc�� ���ͳ� url�� http���� ��������
		String user = "myuser";
		String passwd = "1234";
		//System.out.println(10/0);	//0���� ���� ���� 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//������ ��� ���� �޸𸮿� �ø���
			conn = DriverManager.getConnection(url, user, passwd);
			
			System.out.println("����Ŭ ���� ����!!!");
		} catch (ClassNotFoundException e) { 		//���� ������ ������ ���
			System.err.println("����Ŭ ��,,,��,,, ����");
			System.out.println("ojbdc6.jar ������ �����ϴ� �ڹ� ���� ã�� ����");
			System.out.println("���� : " + e.toString());
		} catch (Exception e){				//��� ������ ��� �׻� �׷��� ���� ��������
			System.err.println("����Ŭ ��,,,��,,, ����");
			System.out.println("���� : " + e.toString());
		} finally {							
			//catch���� ������ ������ �ٷ� catch�� ���� ������ �ڵ尡 �޸𸮿� �������� �� �־�. �׷��� ������ �����ϵ���
			if (conn != null) {
				conn.close();
			}
		}
		conn = null;
	}

}
