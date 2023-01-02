package Maps;

import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Cricket",100);
		map.put("kabadi",200);
		map.put("football",500);
		map.put("Chess",400);
		map.put("null",null);
		map.put("null",588);
		
		map.remove("Chess");
		
		System.out.println(map);
		System.out.println(map.get("Cricket"));
		

	}

}
