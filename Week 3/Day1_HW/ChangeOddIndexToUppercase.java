package week3.day1.homework;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String test = "devi";
 		String output ="";
		

        for (int i = 0; i < test.length(); i++) 
        {
            char ch = test.charAt(i);

            if (i % 2 == 0) 
            {
            	output += Character.toUpperCase(ch);
            } 
            else 
            {
            	output += ch;
            }
        }
        System.out.println("Output: " + output);

	}

}
