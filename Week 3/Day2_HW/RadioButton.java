package week3.day2.homework;

public class RadioButton extends Button
{

	public void selectRadioButton()
	{
		System.out.println("Select the Radio Button");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		RadioButton radiobutton = new RadioButton();
		radiobutton.click();
		radiobutton.setText("Test Data");
		radiobutton.submit();
		radiobutton.selectRadioButton();

	}

}
