package Experiment1;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Praneetha");
		obj.add("Sahithi");
		obj.add("Deepika");
		obj.add("Harshitha");
		obj.add("Divya");
		
		System.out.println("The array list elements are:"+obj);
		
		obj.add(1, "Sanjana");
		obj.remove("Deepika");
		obj.remove("Sahithi");
		
		System.out.println("Current array list is:"+obj);
		obj.remove(1);
		System.out.println("Current array list is:"+obj);
		
	}
}