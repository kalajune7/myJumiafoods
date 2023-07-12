package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsConcepts 
{

	public static void main(String[] args) 
	{
		
		System.out.println("------HashTable Example-----");
		Hashtable<Integer, String> table=new Hashtable<Integer, String>();
		table.put(20, "Pinku");
		table.put(30, "Chinku");
		table.put(41, "Puppy");
		//		table.put(null, "lol"); //are not allowed
		//		table.put(80, null); //are not allowed
		table.put(45, "Chinku");
		table.put(90, "Sonu");
		table.put(69, "rockyBai");
		table.put(69, "rocky");

		System.out.println(table);
		for(Entry<Integer, String> en:table.entrySet()) //For each usage
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		System.out.println(table.size());
		System.out.println(table.contains("Sonu"));
		System.out.println(table.containsKey(45));
		table.remove(69);
		table.remove(69, "rockyBai");
		System.out.println(table.get(45));
		System.out.println(table);

		System.out.println("------HashMap Example-----");
		HashMap<Integer, Object> hm=new HashMap<Integer, Object>();
		hm.put(31, "chinki");
		hm.put(52, null);
		hm.put(null, null);
		hm.put(20, "pinku");
		hm.put(10, 25);
		hm.put(50, null);
		hm.put(41, "Puppy");
		hm.put(21, "Rocky");
		hm.put(null, "lol"); //are allowed
		hm.put(80, null); //are allowed
		hm.put(45, "Chinku");
		hm.put(90, "Sonu");
		System.out.println(hm);
		System.out.println(hm.size());
		for(Entry<Integer, Object> en:hm.entrySet()) //For each usage
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		System.out.println(hm.containsKey(31));
		hm.remove(45);
		hm.remove(31, "chinki");
		System.out.println(hm.get(90));
		System.out.println(hm);
		System.out.println(hm.size());
			
		System.out.println("------LinkedHashMap Example-----");
		LinkedHashMap<Integer , Object> lm=new LinkedHashMap<Integer, Object>();
		lm.put(31, "chinki");
		lm.put(52, null);
		lm.put(null, null);
		lm.put(20, "pinku");
		lm.put(10, 25);
		lm.put(50, null);
		lm.put(41, "Puppy");
		lm.put(21, "Rocky");
		lm.put(null, "lol"); //are allowed
		lm.put(80, null); //are allowed
		lm.put(45, "Chinku");
		lm.put(90, "Sonu");
		System.out.println(lm);
		
		
		System.out.println("------TreeMap Example-----");
		TreeMap<Integer , Object> tm=new TreeMap<Integer, Object>();
		tm.put(31, "chinki");
		tm.put(52, null);
		tm.put(20, "pinku");
		tm.put(10, 25);
		tm.put(50, null);
		tm.put(41, "Puppy");
		tm.put(21, "Rocky");
		tm.put(80, null); //are allowed
		tm.put(45, "Chinku");
		tm.put(90, "Sonu");
		System.out.println(tm);	
	}

}
