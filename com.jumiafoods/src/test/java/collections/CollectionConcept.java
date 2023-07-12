package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionConcept 
{

	public static void main(String[] args) 
	{
		System.out.println("----ArrayList Example----");
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("man");
		al.add(null);
		al.add(21);
		al.add("Hello");
		al.add(null);
		al.add(10);
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(24);
		alist.add(0);
		alist.add(12);
		alist.add(50);
		alist.add(21);
		
		Collections.sort(alist);
		System.out.println(alist);
		al.addAll(alist);
		System.out.println(al);
		if(al.contains("man"))
		{
			System.out.println("is present");
		}
		else
		{
			System.out.println("is not present ");
		}
		
		System.out.println(al.get(4)); //fetch the element present in index 4
		System.out.println(al.size());
		System.out.println(al.remove(2)); //remove the element present in index 2
		System.out.println(al.indexOf("Hello"));  //print the index of hello
		
		for(Object value : al) //fetch elements 1 by 1
		{
			System.out.println(value);
		}
		Iterator<Object> it=al.iterator(); //fetch elements by using iterator method
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("----Stack Example----");
		Stack<Object> stack =new Stack<Object>();
		stack.push(10);
		stack.push("TYSS");
		stack.push(null);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println("----Priority Queue Example----");
		PriorityQueue<Object> q=new PriorityQueue<Object>();
		q.add(25);
		q.add(52);
		q.add(95);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
		
		System.out.println("----HashSet Example----");
		HashSet<Object> set=new HashSet<Object>();
		set.add(12);
		set.add("RCB");
		set.add(null);
		set.add(50);
		set.add("QSP");
		set.add(12);
		set.add(null);
		System.out.println(set);
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(25);
		list.add(null);
		list.add("blr");
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(set.size());
//	
//		System.out.println("----LinkedHashSet Example----");
//		LinkedHashSet<Object> linkSet=new LinkedHashSet<Object>();
//		linkSet.add(24);
//		linkSet.add("RCB");
//		linkSet.add(null);
//		linkSet.add(50);
//		linkSet.add("QSP");
//		linkSet.add(24);
//		linkSet.add(null);
//		System.out.println(linkSet);
//		ArrayList<Object> list1=new ArrayList<Object>(linkSet);
//		list1.add(12);
//		list1.add(null);
//		list1.add("blr");
//		System.out.println(list1);
//		
//		System.out.println(list1.size());
//		System.out.println(linkSet.size());
		
		
		System.out.println("----TreeSet Example----");
		TreeSet<Object> tree=new TreeSet<Object>();
		tree.add(24);
		tree.add(10);
		tree.add(36);
		tree.add(69);
		tree.add(85);
//		tree.add("Manju"); // Heterogenious data not allowed we ll get ClassCastException
//		tree.add(null); //not allowed We ll get NullPointerException
		System.out.println(tree);//Auto sorted Order we get in Ascending order
		System.out.println(tree.higher(24));		
		System.out.println(tree.descendingSet());//Sorted in Decending Order
		
		
	}

}
