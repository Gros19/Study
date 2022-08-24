package answer.animal;

class PolyClass2{
	public static final int ANIMAL=1;
	public static final int PET=2;

	public static void act(Animal2 animal){
		animal.eat();
	}

	public static void act(Pet2 pet){
		pet.play();
	}
}