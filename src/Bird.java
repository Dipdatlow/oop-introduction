
public class Bird {

	String name;
	int age;
	String size;
	public Bird(String name, int age, String size) {
		this.name = name;
		this.age = age;
		this.size = size;
	}
	
	public void fly() {
		System.out.println("The " + name + " is flying");
	}
	
}
