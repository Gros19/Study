package answer.animal2;


public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal3[] arr = new Animal3[3];
		arr[0] = new Spider3();
		arr[1] = new Cat3();
		arr[2] = new Fish3();
		
		Pet3[] arr2 = new Pet3[2];
		arr2[0] = new Cat3();
		arr2[1] = new Fish3();
		
		actAll(arr);
		System.out.println();
		
		playAll(arr2);
		System.out.println();
		
		printInfo(arr);
		
	}
	
	public static void actAll(Animal3[] arr) {
		PolyClass3 poly = new PolyClass3();
		for(int i=0; i<arr.length; i++) {
			poly.act(arr[i]);
		}
	}
	public static void playAll(Pet3[] arr2) {
		PolyClass3 poly = new PolyClass3();
		for(int i=0; i<arr2.length; i++) {
			poly.act(arr2[i]);
		}
	}
	public static void printInfo(Object[] arr3) {
		PolyClass3 poly = new PolyClass3();
		for(int i=0; i<arr3.length; i++) {
			poly.printInfo(arr3[i]);
		}
	}
}
