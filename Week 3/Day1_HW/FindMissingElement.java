package week3.day1.homework;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a[]= {1,4,3,2,8, 6, 7};
			Arrays.sort(a);
			//System.out.println(a[]);
			
			for (int i=0; i<a.length; i++)
			{	
				if (a[i]!= i+1) 
				{
					System.out.println("Missing Element " + (i + 1));
					break;
				}
				
			}	
			
	}

}
