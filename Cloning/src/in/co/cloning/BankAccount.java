package in.co.cloning;

public class BankAccount implements Cloneable {

	public double balance = 0;

	public BankAccount() {
		System.out.println("Default");
	}

	public BankAccount(double b) {
		balance = b;

	}

	public Object clone() throws CloneNotSupportedException {// OPTIONAL TO
																// OVERRIDE IN
		return super.clone();														// CASE
																// OF SHALLOW
																// CLONING
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		BankAccount a1 = new BankAccount(10);
		BankAccount a2 = (BankAccount) a1.clone();
		a2.balance = 20;
		System.out.println(a1.balance);
		System.out.println(a2.balance);

	}

}
