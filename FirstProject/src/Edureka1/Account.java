package Edureka1;
import java.text.DecimalFormat;
import java.util.*;
public class Account {

	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");
	
	/*Set the customer number */
	
	public int setCustomerNumber(int customerNumber) {
		return customerNumber;
		
	}
	
/*get the customer number */
	
	public int getCustomerNumber(int customerNumber) {
		return customerNumber;
		
	}
	/*Set the pin number */
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
		
	}
	
	/*Get the pin number */
	
	public int getPinNumber() {
		return pinNumber;
		
	}	
	/*get checking Account Balance */
	
	public double getCheckingBalance() {
		return checkingBalance;
		
	}
	
/*get saving  Account Balance */
	
	public double getSavingBalance() {
		return savingBalance;
		
	}
/*Calculate checking Account withdrawal */
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
		
	}
	
/*Calculate saving Account withdrawal */
	
	public double calcSavingWithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;
		
	}
	
/*Calculate checking Account deposit */
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
		
	}
/*Calculate saving Account deposit */
	
	public double calcSavingDeposit(double amount) {
		savingBalance=(savingBalance+amount);
		return savingBalance;
		
	}
	// Customer checking  Account withdrawing input
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance:"+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking Account:");
		double amount=input.nextDouble();
		
		if((checkingBalance-amount)>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance:"+moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance cannot be negative."+"\n");
		}
		
	}
	
	// Customer saving  Account withdrawing input
	
		public void getSavingWithdrawInput() {
			System.out.println("Saving Account Balance:"+moneyFormat.format(savingBalance));
			System.out.println("Amount you want to withdraw from saving Account:");
			double amount=input.nextDouble();
			
			if((savingBalance-amount)>=0) {
				calcSavingWithdraw(amount);
				System.out.println("New Saving Account Balance:"+savingBalance+"\n");
			}else {
				System.out.println("Balance cannot be negative."+"\n");
			}
			
		}
		
		// Customer checking  Account Deposit input
		
		public void getCheckingDepositInput() {
			System.out.println("Checking Account Balance:"+moneyFormat.format(checkingBalance));
			System.out.print("Amount you want to deposit from checking Account:");
			double amount=input.nextDouble();
			
			if((checkingBalance+ amount)>=0) {
				calcCheckingDeposit(amount);
				System.out.println("New Checking Account Balance:"+moneyFormat.format(checkingBalance));
			}else {
				System.out.println("Balance cannot be negative."+"\n");
			}
			
		}
		
		// Customer saving  Account deposit input
		
		public void getSavingDepositInput() {
			System.out.println("Saving Account Balance:"+moneyFormat.format(savingBalance));
			System.out.println("Amount you want to deposit from saving Account:");
			double amount=input.nextDouble();
			
			if((savingBalance+amount)>=0) {
				calcSavingDeposit(amount);
				System.out.println("New Saving Account Balance:"+savingBalance+"\n");
			}else {
				System.out.println("Balance cannot be negative."+"\n");
			}
			
		}
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
}
                  





























