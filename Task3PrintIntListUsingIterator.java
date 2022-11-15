package assignment3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task3PrintIntListUsingIterator {

	public static void main(String[] args) 
	{
		
		
		List<Integer> list3 = Arrays.asList(12,25,50,25,1000);
		Iterator<Integer> itr = list3.iterator();
		
		while(itr.hasNext())
		{
			int intList = itr.next();
			System.out.println(intList);
		}
		
		
	}

}
