package week4.day1;

public class Axis implements RBI {

	public void mandatoryKYC() {
		System.out.println("Aadhar as Mandatory");
		
	}
	
	public void deposit() {
		System.out.println("5 Lakhs");
		
	}
	
	public static void main(String[] args) {
		Axis axisOptions=new Axis();
		axisOptions.mandatoryKYC();
	}

}
