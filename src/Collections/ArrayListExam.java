package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {
	public static void main(String[] args) {
		String [] array1 = {"Rajesh","Rakesh","Raman","Lata"};
		System.out.println(array1.length);
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Mohan");
		list1.add("Rama");
		list1.add("Mahesh");
		list1.add("Raju");
		System.out.println(list1);
		System.out.println(list1.size());
		//remove and add is easy in array list
		list1.remove(1);
		System.out.println(list1);
		System.out.println(list1.size());
		//get 
		System.out.println(list1.get(2));
		//set
		System.out.println(list1.set(1, "Hitesh"));
		System.out.println(list1);
		
		//add
		list1.add(1, "Reena");
		System.out.println(list1);
		
		//sort
		Collections.sort(list1);
		System.out.println(list1);
		
		//loop through index
		for (int index=0;index<list1.size();index++) {
			System.out.println(list1.get(index));
		}
		//loop through string
		for (String Name:list1) {
			System.out.println(Name);
		}
		for (int index=0;index<list1.size();index++) {
			if(list1.get(index).equals("Raju")){
				System.out.println(index);
				break;
			}
		}
		
	}

}
