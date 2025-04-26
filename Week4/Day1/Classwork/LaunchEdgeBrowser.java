package week4.day1;

public class LaunchEdgeBrowser extends LaunchChromeBrowser {
	
	public void launch() {
	//System.out.println("Edge is Launched");
	super.launch();
	}
	
	public static void main(String[] args) {
		LaunchEdgeBrowser  browserOptions=new LaunchEdgeBrowser();
		browserOptions.launch();
		}
}
