package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Assignment Details: 
Create a class named CheckNumberIsPositive with integer variable as version with value 10 
-Write a logic to print the given number Positive or Negative. 
 
 
Requirements: 
Create a java class named CheckNumberIsPositive - Declare a with integer variable as version with value 10 
- Use Conditional Statement 
- Print Number Positive 
 
 
Hints to Solve: 
 Check the Number is Greater than Zero 
 
Expected Outcome: 
By completing this assignment, you should be clear on 
 
1. How to arrive logical solution for a problem */
		
		
    int b =10;
    
    if(b>=0)
    {
    	System.out.println(b + "is a Postive number");
    }
	
    else
    {
    	System.out.println(b + "is a Negative number");
    }	
		
	
    /*
     * To check the value from 1 to 10 
     int a=10;
		
	for (int i =0 ; i<=a; i++)	
	{
		if (i >= 0)
		{
			System.out.println(i + " Postive number");
		}
		else
		{
			System.out.println("Negative number");
		}
	}*/
}

}
