package answer.animal2;


public class PolyClass3 {
	final static public int ANIMAL = 1;
	final static public int PET = 2;
	
	public static void act(Animal3 animal) {
		animal.eat();
	}
	public static void act(Pet3 pet) {
		pet.play();
	}
	
	public void printInfo(Object obj) {
		if (obj instanceof Cat3){
			System.out.println("이름: " + ((Cat3) obj).getName());
			System.out.println("다리갯수: " + (Cat3) obj + "\n");
		}else if(obj instanceof Fish3) {
			System.out.println("이름: " + ((Fish3) obj).getName());
			((Fish3) obj).walk();
			System.out.println();
		}
	}
}
