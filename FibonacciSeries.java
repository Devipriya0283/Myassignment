package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method 

		/* Requirements: 
 
 User input for the desired range of the Fibonacci series. 
 Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2, 3, 5, 8, and 13. 
 
Hints to Solve: 
 
 Use a loop to generate the Fibonacci series within the specified range. 
 Initialize variables to keep track of Fibonacci numbers and update them iteratively. 
 Ensure the loop continues until the next Fibonacci number exceeds the given range. 
 
Expected Outcome: 
 
 Learn to use For loop for a defined number of iterations 
 Learn to setup initialization, condition and increment / decrement */
		
		
		int a = 0; 	int b = 1; 	int n = 8;
		
		for(int i =0; i<n; i++)
		{
			System.out.println(a);
			
			int c = a + b;
			a = b;
			b = c;
			
		}
				

	}

}
