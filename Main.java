import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		AtmOperationintrfc op = new atmOperationimpl();
		int atmnumber=12356;
		int atmpin=123;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to ATM Machine");
		System.out.println("Please Enter Atm Number and Pin");
		
		int atmNumber=sc.nextInt();
		int pin = sc.nextInt();

		if(atmnumber==atmNumber && atmpin==pin){
		System.out.println("Validation done");
		
		while(true){
		System.out.println("1.Check Balance\n2.Withdrawn Amount\n3.Deposit Amount\n4.Mini Statement\n5.Exit");
		System.out.println("Enter the  option number");
		
		int ch=sc.nextInt();
		
		if(ch==1){
			op.viewBalance();
		}
		else if(ch==2){
			System.out.println("Enter amount to withdraw ");
			double withdrawAmount=sc.nextDouble();
			op.withdrawAmount(withdrawAmount);
		}
		else if(ch==3){
			System.out.println("Enter amount to deposit");
			double depositAmount=sc.nextDouble();
			op.depositAmount(depositAmount);
		}
		else if(ch==4){
			op.viewMiniStatement();
		}
		else if(ch==5){
		  System.out.println(" collect your atm card\nThank you for using atm machine");
		  System.exit(0);
		}
		else
			System.out.println("please enter valid option");


		}
		}
		else{
		System.out.println("incorrect atmnumber or pin");
		}
		sc.close();
	}

}
