package day8;

public class CurrentAccount {

	private int id;
	private String customerName;
	private int customerAge;
	private double balance;

	// fully parameterized constructor - All-argument constructor
	public CurrentAccount(int id, String customerName, int customerAge, double balance) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.balance = balance;
	}

	// default constructor - no-argument constructor
	public CurrentAccount() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		if (customerAge<18) {
			throw new InvalidAgeException();
		}
		this.customerAge = customerAge;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CurrentAccount [id=" + id + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", balance=" + balance + "]";
	}

	
}
