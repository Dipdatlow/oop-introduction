package firstExample;

public class Earth {
	public static void main(String Args[]) {
		
		Human human1 = new Human("Ricardo", 20, 70, "brown");
		Human human2 = new Human("Rafael", 25, 60, "black");
		Human human3 = new Human("Fatima", 55, 50, "blue");
		
		human1.speak();
		human2.speak();
		human3.speak();
	}
}
