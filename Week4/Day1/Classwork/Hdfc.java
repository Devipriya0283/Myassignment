package week4.day1;

public abstract class Hdfc implements RBI {
	
	public void goldLoan() {
		System.out.println("Upto 1 Lakh");
	}
	
	public void mandatoryKYC() {
		System.out.println("DL is mandatory");
		
	}
	
	public abstract void houseLoan();

}
