package week4.day1;

public class HdfcImplementation extends Hdfc{

	public void deposit() {
		System.out.println("50 Lakks");
		
	}

	
	public void houseLoan() {
		System.out.println("1 Crore");
		
	}
	
	public void goldLoan() {
		super.goldLoan();
		System.out.println("Upto 2 Lakh");
	}
	
	public static void main(String[] args) {
		HdfcImplementation hdfcOptions=new HdfcImplementation();
		//hdfcOptions.houseLoan();
		//hdfcOptions.deposit();
		//hdfcOptions.mandatoryKYC();
		hdfcOptions.goldLoan();
	}

	

}



//HdfcImplementation extends Hdfc implements RBI