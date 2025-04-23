package week3.day1.homework;

public class ReverseOddWordsInAString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String test = "I am a software tester"; 
		
		String[] split = test.split(" ");
		
        StringBuilder result = new StringBuilder();

	for (int i =0; i< split.length ; i++)
		{
			 if (i % 2 != 0) 
	            {
				                 
	                char[] charvalue = split[i].toCharArray();
	                
	                for (int j = charvalue.length - 1; j >= 0; j--) 
	                {
	                    result.append(charvalue[j]);
	                }
	            } 
			 else
			 {
				 result.append(split[i]);
			 }
			 
			 if (i < split.length - 1) {
	                result.append(" ");
	            }
			
		}
	
    System.out.println(result.toString());



	}

}
