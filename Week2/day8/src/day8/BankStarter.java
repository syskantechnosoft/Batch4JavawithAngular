package day8;

public class BankStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount account1 = new CurrentAccount();

		account1.setId(100);
		account1.setCustomerName("ABCD");
//		try {
		account1.setCustomerAge(17);
//		} catch (InvalidAgeException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
		account1.setBalance(2400.00);

		System.out.println(account1);
	}

}
