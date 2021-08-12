package practicewithfriends;

public class CheckingAccount extends Account01 {

	private static double overDraftLimit=100;
	
	public double withdraw(double amount) {
		
		if(amount<=getBalance()+overDraftLimit)
		
		setBalance(getBalance()-amount);
	return getBalance();
}
}