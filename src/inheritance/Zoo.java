package inheritance;

public class Zoo {
	public static void main(String args[]) {

		Fish salmon = new Fish("Salmon", 6, "medium");
		Bird sparrow = new Bird("Jack Sparrow", 3, "small");
		
		salmon.eat();
		sparrow.fly();
	
	}
	
}
