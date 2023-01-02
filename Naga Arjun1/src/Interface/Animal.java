package Interface;

public interface Animal {
	
	public void sleep(String animalName);
	public void run(String animalName);
	public void food(String animalName);
    public void weight(String animalName);
    
    default void display() {
    System.out.println("Animal interface");
    }
    
}
