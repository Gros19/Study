package ExcelPackage;

	class Car {					//1. Car��� Ŭ������ �����
		boolean stat;			//2. stat��� �Ӽ��� �����
		void goCar() {			//3. goCar��� �޼��带 �������
			this.stat = true;	//4. (Car��)this.stat�� true�� �ٲ� ���� ����ϴ� ����� �����մϴ�.
		
		}
	}

	class Sedan extends Car {	//5. Sedan�̶�� Ŭ������ ����� �ռ� ������ Car��� Ŭ�����κ��� ��ӹ޽��ϴ�.
	}
	
public class extend {
	public static void main(String[] args) {
		Sedan sedan_baby = new Sedan(); 	//6. SedanŬ������ �޸𸮷� �ø��� �ν��Ͻ� ���� sedan_baby�� �����մϴ�.
		sedan_baby.goCar();					//7. SedanŬ������ �ƹ��� �Ӽ��� ����� �߰����� �ʾ�������
											//8. �θ�Ŭ���� Car�� �޼��带 ��ӹ޾� ����� �� ������ �� �� �ֽ��ϴ�.
	
		System.out.println("sedan_baby�� �����ִ�? "+sedan_baby.stat);
	}

}
