package day1;

public class MainForAccount1 {

	public static void main(String[] args) {
		
		/*
		 * Revision1 BrianAccount = new Revision1();
		 * System.out.println(BrianAccount.getAccountNumber());
		 * System.out.println(BrianAccount.getBalance());
		 * System.out.println(BrianAccount.getCustomerName());
		 * System.out.println(BrianAccount.getEmailAddress());
		 * System.out.println(BrianAccount.getPhoneNumber());
		 * 
		 * BrianAccount.depositFunds(5000); BrianAccount.withdrawal(28000);
		 */
		Vip Dutch = new Vip();
		System.out.println(Dutch.getName());
		
		Vip Lola = new Vip("Unknown", 570.0);
		System.out.println(Lola.getName());
		
		Vip Joe = new Vip("Drey", 1500.0, "oka4d1@gmail.com");
		System.out.println(Joe.getName());
		
		

	}

}
