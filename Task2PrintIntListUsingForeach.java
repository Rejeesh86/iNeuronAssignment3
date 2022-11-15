package assignment3;

import java.util.Arrays;
import java.util.List;

public class Task2PrintIntListUsingForeach {

	public static void main(String[] args) 
	{
			
		List<Integer> list2 = Arrays.asList(12,25,50,25,1000);
		
		for (Integer intList : list2) 
		{
			System.out.println(intList);
		}
				
		
	}

}
