package polymorphism_study;

public class Override_RTP {

	public static void main(String[] args) 
	{
		
		Bank_RTP bk= new Bank_RTP();
		bk.Loan();
		
		Customer_RTP cx= new Customer_RTP();
		cx.Loan();

	}

}
