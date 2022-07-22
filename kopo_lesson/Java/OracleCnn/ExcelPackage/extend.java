package ExcelPackage;

	class Car {					//1. Car라는 클래스를 만들고
		boolean stat;			//2. stat라는 속성을 만들고
		void goCar() {			//3. goCar라는 메서드를 만들었고
			this.stat = true;	//4. (Car의)this.stat를 true로 바꿔 차가 출발하는 기능을 구현합니다.
		
		}
	}

	class Sedan extends Car {	//5. Sedan이라는 클래스를 만들고 앞서 선언한 Car라는 클래스로부터 상속받습니다.
	}
	
public class extend {
	public static void main(String[] args) {
		Sedan sedan_baby = new Sedan(); 	//6. Sedan클래스를 메모리로 올리고 인스턴스 변수 sedan_baby를 선언합니다.
		sedan_baby.goCar();					//7. Sedan클래스에 아무런 속성과 기능을 추가하지 않았음에도
											//8. 부모클래스 Car의 메서드를 상속받아 사용할 수 있음을 알 수 있습니다.
	
		System.out.println("sedan_baby가 가고있다? "+sedan_baby.stat);
	}

}
