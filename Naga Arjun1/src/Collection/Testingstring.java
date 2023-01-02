package Collection;

import java.util.ArrayList;
import java.util.List;

public class Testingstring {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("cricket");
		arrayList.add("football");
		arrayList.add("Badmittion");
		arrayList.add("tennis");
		arrayList.add("chess");
		
		arrayList.remove(2);
		arrayList.add(2, "kabadi");
		arrayList.add(3,"Basketball");
		System.out.println("List of sports ::" +arrayList.size());
		
			for(String sports : arrayList) {
				System.out.println(sports);
			}
		
		
	}

}
