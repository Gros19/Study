package answer.animal;

abstract class Animal2{
	protected int legs;

	protected Animal2(int legs){
		this.legs = legs;
	}

	public abstract void eat();
	public void walk(){
		if(legs<1)
			System.out.println("�ٸ��� ���� �����Դϴ�.");
		else
		System.out.println(legs+"���� �ٸ��� �̿��ؼ� �Ƚ��ϴ�.");
	}
	public String toString(){
		String str = "�ٸ�����"+legs;
		return str;
	}
		
}
