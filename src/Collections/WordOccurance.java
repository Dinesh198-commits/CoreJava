package Collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		String str = "Clean world green world love world love you";
		//split into array of above string
		String [] words = str.split(" ");
		//create hash map
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		//for count of words occurrence
		for(String word: words) {
			if (map1.get(word) == null) {
				map1.put(word, 1);
			}else {
				map1.put(word, map1.get(word)+1);
			}
			
		}
		System.out.println(map1);
		
		

	}

}
