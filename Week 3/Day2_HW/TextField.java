package week3.day2.homework;

public class TextField extends WebElement 
{
	
	
	public void getText()
	{
		System.out.println("Get the Text Data");
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TextField txtfld = new TextField();
		txtfld.click();
		txtfld.setText("Devi");
		txtfld.getText();

	}

}
