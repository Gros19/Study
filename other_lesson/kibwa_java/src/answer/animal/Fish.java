package answer.animal;

class Fish2 extends Animal2 implements Pet2{
	private String name;

	public Fish2(){
		super(0);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void play(){
		System.out.println(name+"�� �Ϸ����� ���ġ�� ��ϴ�.");
	}

	public void walk(){
		System.out.println(name+"�� ���� ���մϴ�.");
		super.walk();
	}

	public void eat(){
		System.out.println(name+"�� ������ �Խ��ϴ�.");
	}


}
