package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts 
{

	public static void main(String[] args) 
	{

		LinkedList<Object> list=new LinkedList<Object>();
		list.add("man");
		list.add(null);
		list.add(21);
		list.add("Hello");
		list.add(null);
		list.add(10);
		list.add("Tyss");
		

//		ArrayList<Integer> list1=new ArrayList<Integer>();
//		list1.add(24);
//		list1.add(12);
//		list1.add(50);
//		list1.add(0);
//		list1.add(22);
//
//		Collections.sort(list1);
//		System.out.println(list1);
//		list.addAll(list1);
		System.out.println(list);
		if(list.contains("man"))
		{
			System.out.println("is present");
		}
		else
		{
			System.out.println("is not present ");
		}
		list.addFirst(30);
		list.addLast(96);
		System.out.println(list.indexOf(30));
		System.out.println(list.getFirst());
		System.out.println(list.removeLast());
		System.out.println(list.getLast());
		System.out.println(list.removeLast());
//		System.out.println(list.get(4)); //fetch the element present in index 4
//		System.out.println(list.size());
//		System.out.println(list.remove(2)); //remove the element present in index 2
//		System.out.println(list.indexOf("Hello"));  //print the index of hello

//		for(Object value: list) //fetch elements 1 by 1
//		{
//			System.out.println(value);
//		}
		Iterator<Object> it=list.iterator(); //fetch elements by using iterator method
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
