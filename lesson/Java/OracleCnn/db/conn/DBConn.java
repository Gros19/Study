package db.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConn {
	/*
	 * 오라클 DB와 연결하기
	 * @return Connection 오라클 DB 연결 객체
	 */
	public static Connection getDBconnection() throws SQLException {
		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String user = "myuser";
		String passwd = "1234";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			
			System.out.println("오라클 접속 성공!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 접속 실패");
			System.out.println("ojdbc6.jar 파일에 존재하는 자파 파일을 찾지 못함");
			System.out.println("이유: " + e.toString());
			
		} catch (Exception e) {
			System.out.println("오라클 접속 실패 - 최종 Exception까지 호출함");
			System.out.println("이유: " + e.toString());
		}
		
		//오라클 DB와 연결된 자바 오브젝트 결과 값을 전달한다.
		return conn;
	}
	/*
	 * 기존에 연결된 오라클 DB와 접속 해제하기 / 즉, 메모리에 올라간 Connection 오브젝트를 메모리에 지우기
	 * 
	 *@param Connection 기존 오라클 DB와 연결된 자바 오브젝트
	 */
	public static void DBClose(Connection pConn) throws SQLException {
		pConn.close();
		System.out.println("오라클 접속 해제");
	}

}
