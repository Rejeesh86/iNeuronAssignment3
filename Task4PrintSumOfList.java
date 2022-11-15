package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4PrintSumOfList {

	public static void main(String[] args) 
	{
		List<Integer> listNum = new ArrayList<Integer>() ;
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter the size of list");
		int size = sc.nextInt();
		System.out.println("Enter the "+size+" numbers");
		for (int i=0; i<size; i++)
		{
			listNum.add(sc.nextInt());
		}
						
		for (Integer numList : listNum) 
		{
			sum=sum+numList;
		}
			
		System.out.println("Sum of the numbers in the list" +listNum+" is "+sum);
		sc.close();
	}

}
