package assignment3;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task7DisplayTrueIfListContainsMobile {

	public static void main(String[] args) 
	{
		//List<String> list1 = Arrays.asList("Web Automation","Api Automation","Grid Automation");
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of arraylist");
		size=sc.nextInt();
		System.out.println("Enter "+size+" elements to arraylist");
		List<String> list1 = new ArrayList<String>();
		
		for (int i = 0; i<=size; i++) 
		{
			list1.add(i,sc.nextLine());
		}
		list1.remove(0);
		System.out.println(list1);
		int n=0;
		for(int i=0;i<list1.size();i++) 
		{
			if((list1.get(i).contains("Mobile"))||((list1.get(i).contains("mobile"))))
			{
				++n;
				break;
			}
			else
				continue;
		}
		if (n!=0)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		sc.close();
	}

}
