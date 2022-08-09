package oops;

public class RunnerClass {

	public static void main(String[] args) {
		
		Employee E1 = new Employee("Dinesh",234,"PPE");
		E1.Display();
		//Inheritance
		Bank PNB = new Bank();
		PNB.Display_Balance();
		System.out.println(PNB.GetBalance());
		BankPNB SBI = new BankPNB() ;
		System.out.println(SBI.GetBalance());
	    SBI.CCBalance();
	    PNB.account_No = 345670;
	   
	    //overloading:-Overloading allows different methods to have the same name, but different signatures 
	    Overloading area = new Overloading();
	    int RectArea = area.getArea(3, 4);
	    int SqarArea = area.getArea(5);
	    float SquaArea = (float) area.getArea(4.5);
	    System.out.println(+RectArea);
	    System.out.println(+SqarArea);
	    System.out.println(+SquaArea);
	    //overloading1
	    Overloading_1 Value = new Overloading_1();
	    int First = Value.sum(5,4);
	    System.out.println(First);
	    int Second = Value.sum(9,8,7);
	    System.out.println(Second);
	    double Third = Value.sum(3.14,5.14);
	    System.out.println(Third);
	    
	    
	    //overriding
	    PNB.closed_account(345670);
	    SBI.Closed_account(7896);
	    
	    //abstraction ,we cannot make object of abstract class
	    Crome NewCrome = new Crome();
	    NewCrome.OpenBrowser();
	    
	    browser Brow =new Crome();
	    Brow.OpenBrowser();
	    
	    //interface
	    HondaCar HC = new HondaCar();
	    Car Ca = new HondaCar();
	    
	    //Encapsulation
	    Encapculation EnC = new Encapculation();
	    EnC.setBalance(3000);
	    System.out.println(EnC.getBalance());
	    
	    
		
		

	}

	private static void closed_account(int i) {
		// TODO Auto-generated method stub
		
	}

}