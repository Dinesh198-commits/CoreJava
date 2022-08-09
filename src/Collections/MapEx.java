package Collections;

import java.util.HashMap;


public class MapEx {
	public static void main(String[] args) {
	
	//In map along with data also index in table (Key and pair)
	//index will start from1 in map while in reset it start from 0
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(1, "Ram");
	map.put(2, "Mohan");
	map.put(3, "Raman");
	map.put(4, "Rama");
	map.put(5, "Raman");
	map.put(100, "Rajesh");
	map.put(2, "Mohak");
	System.out.println(map);
	System.out.println("Data of 100th key is  " +map.get(100));
	//in Map ,need to apply key for get purpose while in list need sequential value
	map.remove(100);
	System.out.println(map);
	for(@SuppressWarnings("unused") Integer key: map.keySet()) {
		System.out.println(key);
		System.out.println(map.get(key));
		
		
	}
	
	
	}
	

}
