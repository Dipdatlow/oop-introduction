package abstractClass;

public abstract class Animal {
	
	String name;
	int age;
	String size;
	
	public Animal(String name, int age, String size) {
		this.name = name;
		this.age = age;
		this.size = size;
	}
	
	public void eat() {
		System.out.println("the " + name + " is now eating");
	}
	
	public void sleep() {
		System.out.println("the " + name + " is now sleeping");
	}

	public abstract void move();

}
