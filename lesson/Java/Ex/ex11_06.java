package Exam;

class Car{
	 public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	private String color;
	private int speed;
	//�޸𸮿� �ø� �� ����Ǵ� �Լ�
	//�Լ��ϱ� �����ε� ����
	Car(){
		System.out.println("������");
		color = "����";
		speed = 0;		
		System.out.println("�޸� ���� ��");
	}
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;//���� �ڱ� �ڽ��� Ŭ������ �ǹ���
		//this Ŭ������ color �Ķ������ color
	}

	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}
	public class ex11_06{
		public static void main(String[] args){
			Car myCar1 = new Car();
			System.out.println("myCar1�� �ν��Ͻ� ����");
			Car myCar2 = new Car("\'���\'", 1000);
			System.out.println("myCar2�� �ν��Ͻ� ����");
//			myCar1.color = " " public�϶��� ����;
			
			System.out.println("�ڵ��� 1�� ������ " + myCar1.getColor() + "�̸�, ���� �ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
			System.out.println("�ڵ��� 2�� ������ " + myCar2.getColor() + "�̸�, ���� �ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");
		}
	}



