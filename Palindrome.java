package week1.day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 /* Requirements: 
 
- To reverse a number and check for palindrome, Declare two variables of int data type such as 
- ‘input’ to assign the given number 
- ‘output’ to store the reversed form of the input number  - 
Use for loop to reverse the digits of 'input'. - Finally, compare ‘input’ with ‘output’ 
to print whether the given input is a palindrome or not. 
   
Hints to solve: 
 - Implement a 'for' loop where the control variable ‘i’ starts with the value of the ‘input’ variable,
  continues as 
long as ‘i’ is greater than 0, and update ‘i’ by dividing it by 10 in each iteration. 
 - Use appropriate operator to calculate the remainder by dividing the ‘input’ by 10. 
 Assign this value to an integer        
variable ‘rem’. - Use ‘if’ statement to compare the output with the given input. */
		
		int n = 1214;  
		int input = n;  
		int output = 0;

		while (n > 0) {
		    int digit = n % 10; // Get the last digit
		    output = (output * 10) + digit; // Build the reversed number
		    n = n / 10; // Remove the last digit
		}
		
		if (input == output) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
	}

}
