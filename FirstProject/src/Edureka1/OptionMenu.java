package Edureka1;

import java.io.IOException;
import java.util.Map.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.*;

public class OptionMenu extends Account {

	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer>data=new HashMap<Integer, Integer>();
	
	/*  Validate login information customer number and pin number */
	
	public void getLogin()throws IOException{
		
		int x=1;
		
		do {
			try {
				

				data.put(9876543, 9876);
				data.put(6879587, 5684);
				data.put(65474487, 1434);
				
				System.out.println("Welcome to the ATM Project !");
				
				System.out.println("Enter Your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter Your pin Number: ");
				setPinNumber(menuInput.nextInt());
			}
		catch(Exception e) {
			System.out.println("\n"+"Invalid character(s).Only numbers."+"\n");
			x=2;
		}
		
		for(Entry<Integer, Integer> entry : data.entrySet()) {
			if(entry.getKey() == getPinNumber()&&entry.getValue()==getPinNumber());
			getAccountType();
		}
	
		System.out.println("\n"+"wrong customer number or pin number."+"\n");
	}while(x==1);
}



/* Display Account Type Menu with selection*/

public void getAccountType() {
	System.out.println("Select the Account you want to access:");
	System.out.println("Type 1 - Checking Account");
	System.out.println("Type 2 - Saving Account");
	System.out.println("Type 3 - Exit");
	System.out.println("Choice:");
	
	 selection=menuInput.nextInt();
	 
	 switch(selection) {
	 case 1:
		 getChecking();
		 break;
		 
	  
	 case 2:
		 getSaving();
		 break;
		 
		 
	 case 3:
		 System.out.println("thank you for using this ATM,bye......");
		 break;
		 
	default:
		System.out.println("\n"+"Invalid choice."+"\n");
		getAccountType();
	 }
	
}

/* Display  Checking Account  Menu with selection*/

public void getChecking() {
    
	System.out.println(" Checking Account");
	System.out.println("Type 1 -View Balance ");
	System.out.println("Ty pe 2 -Withdraw Funds ");
	System.out.println("Type 3 - Deposit Funds");
	System.out.println("Type 4 - Exit");
	System.out.println("Choice:");
	
	 selection = menuInput.nextInt();
	 
	 switch(selection) {
	 case 1:
		 System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
		 getAccountType();
		 break;
		 
	  
	 case 2:
		 getCheckingWithdrawInput();
		 getAccountType();
		 break;
		 
		 
	 case 3:
		 getCheckingDepositInput();
		 getAccountType();
		 break;

	 case 4:
		 System.out.println("thank you for using this ATM,bye......");
		 break;
		 
	default:
		System.out.println("\n"+"Invalid choice."+"\n");
		getChecking();
		
	 }

}
/* Display Saving Account  Menu with selection*/

public void getSaving() {
    
	System.out.println(" Saving Account");
	System.out.println("Type 1 -View Balance ");
	System.out.println("Type 2 -Withdraw Funds ");
	System.out.println("Type 3 - Deposit Funds");
	System.out.println("Type 4 - Exit");
	System.out.println("Choice:");
	
	 int selection = menuInput.nextInt();
	 switch(selection) 
	 {
	 case 1:
		 System.out.println("Saving Account Balance: "+moneyFormat.format(getSavingBalance()));
		 getAccountType();
		 break;
		 
	  
	 case 2:
		 getSavingWithdrawInput();
		 getAccountType();
		 break;
		 
		 
	 case 3:
		 getSavingDepositInput();
		 getAccountType();
		 break;

	 case 4:
		 System.out.println("thank you for using this ATM,bye......");
		 break;
		 
	default:
		System.out.println("\n"+"Invalid choice."+"\n");
		getSaving();
		
	 }
}
int selection;

}

















