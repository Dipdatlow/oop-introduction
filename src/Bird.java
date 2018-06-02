
public class Bird extends Animal{

	String name;
	int age;
	String size;
	public Bird(String name, int age, String size) {
		super(name, age, size);
		this.name = name;
		this.age = age;
		this.size = size;
	}
	
	public void fly() {
		System.out.println("The " + name + " is flying");
	}
	
}
