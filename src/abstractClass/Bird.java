package abstractClass;

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
	public void flapWings() {
		System.out.println("flappingWings");
	}
	
	public void move() {
		System.out.println("Flapping Wings");
		
	}
}
