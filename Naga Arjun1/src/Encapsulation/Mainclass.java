package Encapsulation;

public class Mainclass {

	public static void main(String[] args) {
		
		Capsule capsu = new Capsule();
		
		capsu.setEmpid(21);
		capsu.setEmpname("Arjun");
		capsu.setLoc("Hyd");
		
		System.out.println("Name :" +capsu.getEmpname() + " ID :" +capsu.getEmpid());


	}

}
