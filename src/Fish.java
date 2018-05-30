
public class Fish {
	
	String name;
	int age;
	String size;
	public Fish(String name, int age, String size) {
		this.name = name;
		this.age = age;
		this.size = size;
	}
	
	public void swimm() {
		System.out.println("the " + name +" is swimming!");
	}
}
