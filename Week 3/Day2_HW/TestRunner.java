package week3.day2.homework;

public class TestRunner {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	 	
		LoginTestData loginTestData = new LoginTestData(); //  this is subclass and extends the superclass
	 
		loginTestData.enterCredentials();
		loginTestData.navigateToHomePage();
		loginTestData.enterUsername();
		loginTestData.enterPassword();

		
		TestData testdata= new TestData();
		testdata.enterCredentials();
		testdata.navigateToHomePage(); // Object created to call the methods from superclass directly
		
		
	}

}
