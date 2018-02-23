package in.co.cloning;

public class Customer implements Cloneable {

	public String name = null;
	public BankAccount account = null;

	public Customer(String n) {
		name = n;
		account = new BankAccount(10);

	}

	public Object clone() throws CloneNotSupportedException {

		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1 = new Customer("Ram");
		// CLONE CUSTOMER AND CHANGE VALUES
		Customer c2 = (Customer) c1.clone();
		c2.name = "Laxman";
		c2.account.balance = 20;
		System.out.println("*** ORIGINAL OBJECT ***");
		System.out.println("NAME " + c1.name);
		System.out.println("BALANCE " + c1.account.balance);
		System.out.println("*** CLONED OBJECT ***");
		System.out.println("NAME " + c2.name);
		System.out.println("BALANCE " + c2.account.balance);

	}

}