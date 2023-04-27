package day1;

public class Account {
	private String number;
	private double balance;
	private String name;
	private String phoneNumber;
	private String emailAddress;
	
	public Account() {
		this("1230862509",80000, "default name", "default number", "default email");
		System.out.println("Empty constructor called");
	}

	public Account(String number, double balance, String name,
			String phoneNumber, String emailAddress) {
		System.out.println("Account Constructor parameter called");
		this.balance = balance;
		this.emailAddress = emailAddress;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public Account(String name, String emailAddress, String phoneNumber) {
		this("6236495215", 1500.5, name, emailAddress, phoneNumber);
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " with a new balance of " + this.balance);
	}
	public void withdrawal(double withdraw) {
		if(this.balance - withdraw >= 0) {
			this.balance -= withdraw;
			System.out.println("You've withdrawn " + withdraw + " and have a balance of "+ this.balance+ ".");
		}
		else {
			System.out.println("Only "+ this.balance + " available. Withdrawal not processed.");
		}
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
