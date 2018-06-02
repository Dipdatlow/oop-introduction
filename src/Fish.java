
public class Fish extends Animal{
	
	String name;
	int age;
	String size;
	public Fish(String name, int age, String size) {
		super(name,age, size);
		this.name = name;
		this.age = age;
		this.size = size;
	}
	
	public void swimm() {
		System.out.println("The " + name +" is swimming!");
	}
}
