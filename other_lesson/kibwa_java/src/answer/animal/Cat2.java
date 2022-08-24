package answer.animal;

class Cat2 extends Animal2 implements Pet2{
	private String name;
		
	public Cat2(String name){
		super(4);
		this.name = name;
	}
	public Cat2(){
		this("���ϰ����");
	}


	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void play(){
		System.out.println(name+"�� ȥ�� ���ƴٴմϴ�.");
	}

	public void eat(){
		System.out.println(name+"�� �Ź̿� �㸦 ��ƸԽ��ϴ�.");
	}

	public String toString(){
		return "�̸�: "+name+"\n"+super.toString();
	}
}
