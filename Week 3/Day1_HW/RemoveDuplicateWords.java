package week3.day1.homework;

public class RemoveDuplicateWords 
{
	public static void main (String[] args)
	{
		int countVar = 0;
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		String[] txtArray = text.split(" ");
		//System.out.println(txtArray);
		
		for (int i=0; i < txtArray.length ; i++ )
		{
			for (int j= i +1 ; j < txtArray.length ; j++)
			{
				if (!txtArray[i].isEmpty() && txtArray[i].equalsIgnoreCase(txtArray[j]))
				{
					txtArray[j] = "";
					countVar++;
				}
				
			}
		}
		if (countVar > 0) {
		    System.out.println("Text after removing duplicates:");
		    for (String txtAry : txtArray) 
		    {
		        System.out.print(txtAry + " ");
		    }
		    System.out.println("\nDuplicates removed: " + countVar);
		} else {
		    System.out.println("No duplicates found.");
		}
		

				
		
	}

}
