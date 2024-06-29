import java.util.*;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin=1211;
		int balance=10000;
		int deposit=0,withdraw=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin Number: ");
		int password=sc.nextInt();
		if(password==pin) {
		  while(true) {
			System.out.println("Choose 1 for CheckBalance");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Withdraw");
			System.out.println("Choose 4 for Recipt");
			System.out.println("Choose 5 for EXIT");
			System.out.print("Choose the operation: ");
			int option=sc.nextInt();
			switch(option) {
			   case 1:
				   System.out.println("Your Current Balance is "+balance);
				   break;
			   case 2:
				   System.out.println("Enter money to be deposited: ");
				   deposit=sc.nextInt();
				   balance+=deposit;
				   System.out.println("Your Money has been successfully depsited");  
				   break;
			   case 3:
				   System.out.println("Enter money to be withdrawn: ");
				   withdraw=sc.nextInt();
				   if(balance>withdraw) {
					   balance-=withdraw;
					   System.out.println("Please collect your money");
				   }
				   else {
					   System.out.println("Insufficient Balance");
				   }
				   break;
			   case 4:
				   System.out.println("Your current Balance: "+balance);
				   System.out.println("Amount Deposites: "+deposit);
				   System.out.println("Amount Taken: "+withdraw);
				   break;
			}
			if(option==5) {
				System.out.println("");
			}
		  }
		}
		else {
			System.out.println("Pin Number Invalid");
		}
	}
}
