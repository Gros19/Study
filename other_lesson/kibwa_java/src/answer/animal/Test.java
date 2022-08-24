package answer.animal;

class Test{
	public static void main(String[] args){
		Spider2 spider = new Spider2();
		spider.legs = 8;

		Fish2 fish = new Fish2();
		fish.setName("�����");
		fish.legs=0;
		
		Cat2 cat = new Cat2();
		
		PolyClass2.act((Animal2)spider);
		PolyClass2.act((Animal2)cat);
		PolyClass2.act((Animal2)fish);
		System.out.println();

		PolyClass2.act((Pet2)cat);
		PolyClass2.act((Pet2)fish);
		System.out.println();

		System.out.println("�̸� : "+fish.getName());
		fish.walk();
		System.out.println();

		System.out.println(cat.toString());
		

	

		

		
		




	}
}
