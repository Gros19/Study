package service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintUserInfo {

	public static void main(String[] args) throws SQLException {
		// �Է¹޴� ���� �����ϱ� ���� ��ü ����
		Map<String, String> pMap = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
	   System.out.println("ȸ����������� �����մϴ�.\n\n");
	   System.out.println("���� �� �ϳ��� ������.\n1.insert\n2.delete\n3.update\n4.check and insert");
	   int choice_query = sc.nextInt();
	  
	   
	   System.out.println("==============================");
	   System.out.println("ȸ�����̵� �Է��Ͻÿ� : ");
	   pMap.put("user_id", sc.next());
	   
	   if(choice_query != 2) //delete�� �� user_id�� �ޱ� ����
	   {
		System.out.println("==============================");
		System.out.println("ȸ���̸��� �Է��Ͻÿ� : ");
		pMap.put("user_nm", sc.next());

		System.out.println("==============================");
		System.out.println("�̸����� �Է��Ͻÿ� : ");
		pMap.put("email", sc.next());

		System.out.println("==============================");
		System.out.println("�ּҸ� �Է��Ͻÿ� : ");
		pMap.put("addr", sc.next());
	   }
	   sc.close();
		

		switch(choice_query) {
		case 1:
		{
//			 DB�� ����� ���� ��ü�� �޸𸮿� �ø�
			   DBinsert dbI = new DBinsert();
//				 DB����� ���� �Լ� ȣ��
			   dbI.doInsert(pMap);
			break;
			}
		case 2:
		{
//			 DB�� ����� ���� ��ü�� �޸𸮿� �ø�
			   DBDelete dbD = new DBDelete();
//				 DB����� ���� �Լ� ȣ��
			   dbD.doDelete(pMap);
			break;
			}
		case 3:
		{
//			 DB�� update�� ��ü�� �޸𸮿� �ø�
			DBUpdate dbU = new DBUpdate();
//			// DB������ ���� �Լ� ȣ��
			dbU.doUpdate(pMap);
			break;
			}
		case 4:{
			DBCheck cdbI = new DBCheck();
			cdbI.CheckDoInsert(pMap);
			break;
		}
			
		}



		// ����� ������ �޸� ����
		pMap = null;

		// ȸ�� ������ �������� ���� DBUserInfo ��ü�� �޸𸮿� �ø�
		DBUserInfo ui = new DBUserInfo();

		// ȸ�� ���� ��������
		List<Map<String, String>> rList = ui.getUserInfo();

		System.out.println("\n\nȸ����������� �����մϴ�.\n\n");


	}


}