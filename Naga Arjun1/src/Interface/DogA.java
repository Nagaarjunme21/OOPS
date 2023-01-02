package Interface;

public class DogA implements Animal {

	public void sleep(String animalName)
	{
		System.out.println(animalName +"Sleeping");
	}
	
	public void run(String animalName)
	{
		System.out.println(animalName +"running");
	}
	
	public void food(String animalName)
	{
		System.out.println(animalName +"food");
		
	}

	public void weight(String animalName)
	{
		System.out.println(animalName +"weight");
	}

	
}
