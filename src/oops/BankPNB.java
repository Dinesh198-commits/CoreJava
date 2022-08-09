package oops;

public class BankPNB extends Bank{
	public int CreditCardNumber;
	public void CCBalance() {
		System.out.println("Inside Credit Card Balance");
		super.account_No = 123456;//represent parent class
		this.account_No = 7896;
		
	}
	public void Closed_account(int CCNumber) {
		System.out.println("Inside Credit Card Balance");
	}

}