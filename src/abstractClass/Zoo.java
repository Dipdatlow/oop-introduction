package abstractClass;

public class Zoo {
	public static void main(String args[]) {

		// Polymorphism example
		
		Animal fish1 = new Fish("Nemo", 6, "small");
		Animal sparrow = new Sparrow("Jack Sparrow", 3, "small");
		
		moveAnimals(fish1);
		moveAnimals(sparrow);
	
	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}
	
}
