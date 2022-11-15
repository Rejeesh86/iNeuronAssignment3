package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6PickFromArrayAndStoreInList 
{
  public static void main (String args[]) 
  {
	Scanner sc = new Scanner(System.in);
	int size;
	System.out.println("Enter the size of array");
	size = sc.nextInt();
	Object [] namesArray = new Object[size];
	List <Object> nameList = new ArrayList<Object>();
	
	System.out.println();
	System.out.println("Enter elements to array");
	for (int i=0; i<size; i++)
	{
		namesArray[i] = sc.next();
		nameList.add(i, namesArray[i]);
	}
    
    System.out.println("Elements in list :"+nameList);
    sc.close();
  } 
}
