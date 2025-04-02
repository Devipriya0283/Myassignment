package week1.day2;

public class IsPrime {

public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
/* Assignment Details: 
 
 - Create a class by name: IsPrime - Create a main method using shortcut - 
 Write a logic to find if the given number is prime or not - Print if it is prime or not 
 
Requirements: 
 - Create a Java class named IsPrimeNumber. - Add a main method in the IsPrimeNumber class,
  either by typing it or using a shortcut(Type 
main +ctrl+space & Enter). - 
Inside the main method, write java code to print the number is prime or not in the console. 
-Save the code and run the program (right-click -> Run as -> Java Application). 
 
Hints to Solve: 
 
		 Iterate through all numbers from 2 to n-1 (input) and for every number check 
		if it divides n 
		(input).  
		 If we find any number that divides, print non-prime. 
		 If nothing divides, then print prime*/
		
		int n = 20;
		boolean isprime = true;
		
		if (n<=1)
			{
			isprime = false;	
			}
		else 
			{
		for (int i=2; i<= Math.sqrt(n) ; i++)
		{
			if(n%i == 0)
			{
				isprime = false;
				break;
			}
		}
		
		if (isprime)
		{
			System.out.println(n + " is a prime number");
		}
		
		else
			
		{
			System.out.println(n + " is not a prime number");
		}
			
		}
		
		}

	}


