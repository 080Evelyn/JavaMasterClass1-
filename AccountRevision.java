package day1;

public class AccountRevision {
	private double number;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	public double getAcccountNumber() {
		return number;
	}
	public void setAcccountNumber(double number) {
		this.number = number;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFunds(double deposit){
		 this.balance =+ deposit;
		System.out.println("You deposited "+ deposit + "Your balance is "+ this.balance);
	}
	public void withdrawFunds(double withdraw) {
		this.balance =- withdraw;
		if(withdraw > balance) {
			System.out.println("Insufficient funds! You ca only withdraw " +this.balance);
		}else {
			System.out.println("You have withdrawn "+ withdraw + ", your balance is "+ this.balance);
		}
	}
	

}
