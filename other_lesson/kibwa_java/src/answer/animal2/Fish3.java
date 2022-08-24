package answer.animal2;

public class Fish3 extends Animal3 implements Pet3{
	private String name = "물고기";
	
	Fish3(){
		super(0);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void play() {
		System.out.println(name + "는 하루종일 헤엄치며 놉니다.");
	}
	public void walk() {
		System.out.println(name + "는 걷지 못합니다.");
		super.walk();
	}
	public void eat() {
		System.out.println(name + "는 벌레를 먹습니다.");
	}
	
}
