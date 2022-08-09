package oops;

public class Bank {
	public int account_No;
	public void Display_Balance() {
		System.out.println("display balance");
	}
	public int GetBalance() {
		return 1000;
		
	}
	public void closed_account(int account_No) {
		System.out.println("closed account");
	}
}
