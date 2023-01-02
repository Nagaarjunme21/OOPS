package Interface;

public class MainClass {

	public static void main(String[] args) {
		DogA dogA = new DogA();
		DogB dogB = new DogB();
		
		
		dogA.sleep("dogA");
		dogB.run("dogB");
		dogA.food("dogA");
		dogA.weight("dogA");
	}

}
