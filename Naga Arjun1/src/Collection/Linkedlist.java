package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("cricket");
		linkedList.add("football");
		linkedList.add("Badmittion");
		linkedList.add("tennis");
		linkedList.add("chess");

		linkedList.remove(2);
		linkedList.add(2, "kabadi");
		linkedList.add(3,"Basketball");
		linkedList.get(1);
		linkedList.clone();
	    
		System.out.println();
		System.out.println("List of sports ::" +linkedList.size());
		System.out.println("get method ::" +linkedList.get(1));
		
		
		for(String sports : linkedList) {
			System.out.println(sports);
		}
	}

}
