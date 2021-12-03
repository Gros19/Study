package db.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbTest {

	public static void main(String[] args) throws SQLException {
		/* Exception은 예외처리라는 뜻이고 그 방법이 두가지
		  1. try & catch
		  2. SQLExeption
		 
		SQLExeption
		
		범용적 에러용
		이 메인 함수 내에서 에러가 발생하면 catch의 역할을 SQLException에 넘겨서 처리
		여러 파일에서 에러가 발생하면 중복 처리가 생기지 않아 편리하고
		제일 많이 씀
		단점으로 메모리 누수를 못 막아
		
		try & catch
		
		디테일한 에러 처리용
		try catch는 간단한 에러와 메모리 누수를 막을 때
		그래서 두개 같이 써
		
		*/ 
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//jdbc는 인터넷 url에 http같은 프로토콜
		String user = "myuser";
		String passwd = "1234";
		//System.out.println(10/0);	//0으로 나눠 에러 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//오류를 잡기 위해 메모리에 올리고
			conn = DriverManager.getConnection(url, user, passwd);
			
			System.out.println("오라클 접속 성공!!!");
		} catch (ClassNotFoundException e) { 		//예상 가능한 에러만 잡아
			System.err.println("오라클 접,,,속,,, 실패");
			System.out.println("ojbdc6.jar 파일이 존재하는 자바 파일 찾지 못함");
			System.out.println("이유 : " + e.toString());
		} catch (Exception e){				//모든 에러를 잡아 항상 그래서 제일 마지막에
			System.err.println("오라클 접,,,속,,, 실패");
			System.out.println("이유 : " + e.toString());
		} finally {							
			//catch에서 에러가 잡히면 바로 catch로 가기 때문에 코드가 메모리에 남아있을 수 있어. 그래서 무조건 실행하도록
			if (conn != null) {
				conn.close();
			}
		}
		conn = null;
	}

}
