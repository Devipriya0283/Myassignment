package week4.day1.homework;

public class JavaConnection implements DatabseConnection
{
		
    private boolean isConnected = false;


	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
		isConnected = true;
        System.out.println("Connected to the Java database.");
	 
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
		if (isConnected) {
            isConnected = false;
            System.out.println("Disconnected from the Java database.");
        } else {
            System.out.println("No active connection to disconnect.");
        }
		
	}

	@Override
	public void executeUpdate() 
	{
		// TODO Auto-generated method stub
		

		 if (isConnected) {
	            System.out.println("Executing update: ");
	            // pretend the query ran successfully
	        } else {
	            System.out.println("Cannot execute update. No active connection.");
	        }		
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		JavaConnection javaconnection = new JavaConnection();
		javaconnection.connect();
		javaconnection.disconnect();
		javaconnection.executeUpdate();

	}

}
