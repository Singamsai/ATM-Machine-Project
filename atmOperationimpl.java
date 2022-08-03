import java.util.HashMap;
import java.util.Map;

public class atmOperationimpl implements AtmOperationintrfc {
	ATM atm =new ATM();
	Map<Double,String> ministmt = new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is: "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
	if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) {
		ministmt.put(withdrawAmount, " amount withdrawn");
		System.out.println("Collect the cash "+withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
	}
	else {
		System.out.println("Insufficient funds");
	}
	}
	else
		System.out.println("Please enter multiples of 500 and try again");
}
	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount, " amount deposited");
		System.out.println(depositAmount+" Deposited successfully");
		atm.setBalance(depositAmount+atm.getBalance());
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		viewBalance();
	}

	
}
