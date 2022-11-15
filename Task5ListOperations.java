package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task5ListOperations {

	public static void main(String[] args) 
	{
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(33);
		numbers.add(44);
		numbers.add(55);
		numbers.add(66);
		numbers.add(77);
		numbers.add(88);
		System.out.println("List to perform operation: "+numbers);
		numbers.remove(1);
		System.out.println("New list after removing second element using index is "+numbers);
		System.out.println();
//		numbers.remove(55);

		List<String> numStr = new ArrayList<String>();
		numStr.add("33");
		numStr.add("44");
		numStr.add("55");
		numStr.add("66");
		numStr.add("77");
		numStr.add("88");
		numStr.remove("55");
//		boolean removedStr = numStr.remove("55");
//		System.out.println(removedStr);
		System.out.println("New list after removing second element using value is "+numStr);
		System.out.println();
		
		numbers.add(3, 90);
		System.out.println("New List after adding 90 at index 3 is "+numbers);
		System.out.println("Size of the list is "+ numbers.size()); 
		System.out.println();
		
		Iterator<Integer> itr = numbers.iterator();
		System.out.println("Printing values in the list below :");
		while(itr.hasNext())
		{
			int number = itr.next();
			System.out.println(number);
		}
		System.out.println();
		
		System.out.println("Converting values in the list to array and printing below :");
		Object [] numArray = numbers.toArray();
		for (Object obj : numArray) 
		{
			System.out.println(obj);
		}
		
	}

}
