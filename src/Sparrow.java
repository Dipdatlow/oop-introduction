
public class Sparrow extends Bird implements Flyable{

	public Sparrow(String name, int age, String size) {
		super(name, age, size);
		 
	}
	
	public void fly() {
		System.out.println("The " +name + " is flying!");
	}
}
