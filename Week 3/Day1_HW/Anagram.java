package week3.day1.homework;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//- Define two input strings. 

			String text1 = "stops";
			String text2 = "potss";
			
			if (text1.length()==text2.length())
			{
				char[] chartext1 = text1.toCharArray();
				Arrays.sort(chartext1);
				char[] chartext2 =  text2.toCharArray();
				Arrays.sort(chartext2);
				
					if (Arrays.equals(chartext1, chartext2))
					{
						System.out.println("The given strings are Anagram.");
					}
					else
					{
						System.out.println("The given strings are not an Anagram.");
					}
			}
			else
			{
				System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			}
			
	}

}
