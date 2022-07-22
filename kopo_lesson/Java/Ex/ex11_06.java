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
	//메모리에 올릴 때 실행되는 함수
	//함수니까 오버로딩 가능
	Car(){
		System.out.println("생성자");
		color = "빨강";
		speed = 0;		
		System.out.println("메모리 생성 끝");
	}
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;//현재 자기 자신의 클래스를 의미함
		//this 클래스의 color 파라미터의 color
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
			System.out.println("myCar1의 인스턴스 생성");
			Car myCar2 = new Car("\'노랑\'", 1000);
			System.out.println("myCar2의 인스턴스 생성");
//			myCar1.color = " " public일때만 가능;
			
			System.out.println("자동차 1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km 입니다.");
			System.out.println("자동차 2의 색상은 " + myCar2.getColor() + "이며, 현재 속도는 " + myCar2.getSpeed() + "km 입니다.");
		}
	}



