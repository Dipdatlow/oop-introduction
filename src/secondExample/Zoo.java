package secondExample;

public class Zoo {
	public static void main(String args[]) {
		
		Animal zebra = new Animal("Zebra", 10, "medium");
		Animal lion = new Animal("Lion", 6, "medium");
		Animal elephant = new Animal("Elephant", 25, "large");
		
		zebra.eat();
		lion.move();
		elephant.sleep();
		
	}
	
}
