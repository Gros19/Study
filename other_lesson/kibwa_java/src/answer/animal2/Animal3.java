package answer.animal2;

public abstract class Animal3 {
	// 다리갯수
	public int legs;
	
	protected Animal3(int legs){
		this.legs = legs;
	}
	
	public void eat() {};
	public void walk() {
		if(legs == 0) {
			System.out.println("다리가 없는 동물입니다.");
		}
	};
	public String toString() {
		return "";
	}
}
