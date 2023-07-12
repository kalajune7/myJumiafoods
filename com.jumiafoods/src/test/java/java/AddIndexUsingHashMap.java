package java;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;

/*
 * 13. input : int a[]={7,2,12,15} result=9;
 * o/p: index I and index J if we add index I and Index J we have to get 9(using Hashmap)
 */
public class AddIndexUsingHashMap 
{

	public static void main(String[] args) 
	{
		int a[]={7,2,12,15};
		HashMap< Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			map.put(0, a[i]);			
		}
		System.out.println(a[0]+a[1]);
		
		
	}

}
