package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task1PrintIntListUsingForLoop {

	public static void main(String[] args) 
	{
		List <Integer> list1= new ArrayList<>();
		list1.add(12);
		list1.add(25);
		list1.add(50);
		list1.add(25);
		list1.add(1000);
		System.out.println(list1);
//		List<Integer> list2 = Arrays.asList(12,25,50,25,1000);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
	}

}
