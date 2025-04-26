package week4.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementusingList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*Assignment Details: 
 
	Find the missing element from the list of integers 
 
	Assignment Requirements: 
	- Declare an array {1, 2, 3, 4, 10, 6, 8}. 
	- Do a comparison check if there is a gap in the sequence of numbers. 
	- Print the numbers that are missing. 
 
	Hints to Solve: 
 
 	- Arrange the collection in ascending order - Inside the loop, check the current element + 1 is not equal 
 	to the next element. 
	This comparison checks if there is a gap in the sequence of numbers 
 	- Use the get() method to get an element from the list 
 	- Print the number if a gap is detected. */
		
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.add(10);
		array1.add(6);
		array1.add(8);
		Collections.sort(array1);
		System.out.println(array1.toString());
		
		for (int i=0; i<array1.size()-1; i++)
		{
			if (array1.get(i) +1 != array1.get(i+1))
			{
				System.out.println(array1.get(i) +1 );
			}
			 
			 
			}
		}
	

}
