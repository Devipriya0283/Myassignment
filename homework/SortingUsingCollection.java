package week4.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Assignment Details: 
			 
			Reverse the given collection of String elements 
			 
			Assignment Requirements: 		 
			Declare a String array and 
			add the values as {HCL, Wipro, Aspire Systems, CTS}    
			 Add the collection to a list  
			 Iterate the values in the list 
			 Print the required output as Wipro, HCL, CTS, Aspire Systems 		 
			Hints to Solve: 			 
			 - Arrange the collection in ascending order - Use reverse loop to
			 iterate the collection*/
		
		List<String> reverseCollection = new ArrayList<String>();
		reverseCollection.add("HCL");
		reverseCollection.add("Wipro");
		reverseCollection.add("Aspire Systems");
		reverseCollection.add("CTS");
		Collections.sort(reverseCollection);
		
		for (int i = reverseCollection.size() -1 ; i >= 0 ; i--)
		{
			System.out.println(reverseCollection.get(i));
		}
		
		//Collections.reverse(reverseCollection);
		// System.out.println(reverseCollection);
		
		}

	}


