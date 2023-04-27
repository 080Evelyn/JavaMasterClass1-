package day1;

public class MainForAccount {

	public static void main(String[] args) {
		Account EveAccount = new Account();//("1230862509", 2500.0,"Okafor","08059450938", "oka4@gmail.com");
		System.out.println(EveAccount.getNumber());
		System.out.println(EveAccount.getBalance());
		System.out.println(EveAccount.getPhoneNumber());
		System.out.println(EveAccount.getEmailAddress());
		System.out.println(EveAccount.getNumber());
		
		EveAccount.deposit(10000.0);
		EveAccount.withdrawal(500.0);
		EveAccount.deposit(700);
		
		Account TimAccount = new Account("Tim", "tim48@gmail.com", "09059296155");
		System.out.println(TimAccount.getNumber() + " name " + TimAccount.getName());
		
		VipCustomer Ada = new VipCustomer();
		System.out.println(Ada.getName());
		
		VipCustomer Ngozi = new VipCustomer("Customer", 1000.0);
		System.out.println(Ngozi.getCreditLimit());
		
		VipCustomer Tasha = new VipCustomer("Cobbs", 1500.00, "ella24@gmail.com");
		System.out.println(Tasha.getName());
		
	}
}
