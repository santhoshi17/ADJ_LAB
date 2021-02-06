package Experiment1;

import java.util.*;

public class Hashmap {
	
	public static void main(String args[]) {
		
		HashMap<String, Double> hm = new HashMap <String, Double>();
		
		hm.put("Divya", new Double(5489.43)); 
		hm.put("Santhoshi", new Double(2348.45));
		hm.put("Prathyusha", new Double(561.70));
		hm.put("Prabha", new Double(1271.00));
		hm.put("Supriya", new Double(-7.32));
		
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			}
		
		System.out.println();
		double balance = ((Double)hm.get("Santhoshi")).doubleValue();
		hm.put("Santhoshi", new Double(balance + 1000));
		System.out.println("Santhoshi's new balance: " +hm.get("Santhoshi"));
		}
}