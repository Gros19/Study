package Exam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//i�������̽�
//cŬ����
public class ListEx {

	public static void main(String[] args) {
		List<String> rList = new LinkedList<String>();
		//ArrayListŬ����
		//�޸𸮰� �÷������� �ʾ�
		//�̸��� ����?
		//��ü�� ����?
		//�������̽�
		rList.add("������");
		rList.add("ȫ�浿");
		
		System.out.println("�迭�� ũ��" + rList.size());
		
		for(int i = 0; i< rList.size(); i++) {
			System.out.printf("%d��° �迭 ������: %s\n",i,rList.get(i));
		}
		
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String name = (String)it.next();
			//object���� ��ӹ޾� ����ϴµ� �׶� String���� ����ȯ
			if(name == "������")
				System.out.printf("<%s>\n",name);
			else
				System.out.println(name);
		}
			
		
		 

	}

}
