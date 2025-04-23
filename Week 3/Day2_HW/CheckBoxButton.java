package week3.day2.homework;

public class CheckBoxButton extends Button
{
	
	public void clickCheckButton()
	{
		System.out.println("Check the click button");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		CheckBoxButton chkbxbut = new CheckBoxButton();
		chkbxbut.click();
		chkbxbut.setText("Test Data");
		chkbxbut.submit();
		chkbxbut.clickCheckButton();

	}

}
