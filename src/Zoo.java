
public class Zoo {
	public static void main(String args[]) {
		
		Animal zebra = new Animal("Zebra", 10, "medium");
		Animal lion = new Animal("Lion", 6, "medium");
		Animal elephant = new Animal("Elephant", 25, "large");
		
		Bird parrot = new Bird("Parrot", 3, "small");
		Fish salmon = new Fish("Salmon", 2, "small");
		
		zebra.eat();
		lion.move();
		elephant.sleep();
		
		parrot.fly();
		salmon.swimm();
		parrot.eat();
	}
}
