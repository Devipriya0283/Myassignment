package week4.day2.homework;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] a = {3, 2, 11, 4, 6, 7};
		
		int[] b = {1, 2, 8, 4, 9, 7};
		
	
		for (int i =0; i<a.length ; i++)
		{
		  for (int j=0 ;j<b.length ; j++)
		  {
			  if (a[i]==b[j])
			  {
				  System.out.println("Value is equal " +a[j]);
			  }
		  }
		}
		
		
		List<Integer> a1 =new ArrayList<Integer>();
		a1.add(3);
		a1.add(2);
		a1.add(11);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		System.out.println(a1);

		List<Integer> a2 = new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		a2.add(8);
		a2.add(4);
		a2.add(9);
		a2.add(7);
		
		System.out.println(a2);
		
		for (int i =0; i<a1.size(); i++)
		{
				if (a1.get(i) == a2.get(i))
				{
					System.out.println(a1.get(i));
				}
			
		}
	}

}
