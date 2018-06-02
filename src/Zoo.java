
public class Zoo {
	public static void main(String args[]) {

		Animal chicken = new Fish("Nemo", 6, "small");
		Animal sparrow = new Sparrow("Jack Sparrow", 3, "small");
		
		moveAnimals(chicken);
		moveAnimals(sparrow);
	
	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}
	
}
