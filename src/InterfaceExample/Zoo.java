package InterfaceExample;

public class Zoo {
	public static void main(String args[]) {

		Chicken chicken = new Chicken("Chicken Little", 6, "small");
		Sparrow sparrow = new Sparrow("Jack Sparrow", 3, "small");
		
		chicken.eat();
		sparrow.fly();
	
	}
	
}
