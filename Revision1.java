package day1;

public class Revision1 {
	public String accountNumber;
	public double balance;
	public String customerName;
	public String emailAddress;
	public String phoneNumber;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void depositFunds(double deposit) {
		this.balance += deposit; 
	}
	public void withdrawal(double withdraw) {
		this.balance -= withdraw;
		if(balance < withdraw) {
			System.out.println("Insufficient funds "+ "you only have "+ (balance + withdraw));
		}
		else {
			System.out.println("You've withdrawn "+ withdraw + " and have a balance of "+ balance);
		}
	}
	

}
