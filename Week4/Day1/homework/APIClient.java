package week4.day1.homework;

public class APIClient {
	
    // Overloaded method with one argument


	public void sendRequest(String endpoint) 
	{
		System.out.println("Final Value " + endpoint);
	}
	
    // Overloaded method with three arguments

	
	public void sendRequest(String endpoint,String requestBody, boolean requestStatus) 
	{
		if (endpoint.equalsIgnoreCase(requestBody))
	 {
			if (requestStatus) 
			{
			    System.out.println("Request is successful");
			} else 
			{
			    System.out.println("Request is  not successful");
			}
			
		}
		
		else 
		{
            System.out.println("Endpoint and request body do not match");
        }
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		APIClient apiclt = new APIClient();
		
		// Call the first version
		apiclt.sendRequest("Data");
		
        // Call the overloaded version
		apiclt.sendRequest("Devi", "Devi", true);

	}
}