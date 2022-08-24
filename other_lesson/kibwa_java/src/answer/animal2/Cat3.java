package answer.animal2;


public class Cat3 extends Animal3 implements Pet3 {
	private String name;
	
	Cat3(String name){
		super(4);
		this.name = name;
	}
	public Cat3(){
		super(4);
		this.name = "도둑고양이";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void play() {
		System.out.println(name + "는 혼자 돌아다닙니다.");
	}
	public void eat() {
		System.out.println(name + "는 거미와 쥐를 잡아먹습니다.");
	}
	public String toString() {
		return "" + legs;
	}
}
