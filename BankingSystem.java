package bankingSystem;
import java.util.*;


class Account {
	
	String holderName;
	double balance;
	int accountNumber;
	
	public Account (String name, double  balance, int accountNumber) {
		this.holderName = name;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	
	public void showDetails() {
		System.out.println("Account Number: " + accountNumber);
	    System.out.println("Holder: " + holderName);
	    System.out.printf("Balance: %.2f%n", balance);
	}
	
}

class SavingAccount extends Account {
	
	int interestRate;
	
	public SavingAccount(String holderName, double balance, int accountNumber, int interestRate) {
        super(holderName, balance, accountNumber);  
        this.interestRate = interestRate;
    }
	
	@Override
	public void showDetails() {
		 super.showDetails();
		 System.out.println("Interest Rate: " + interestRate + "%");
		 
	}
	
}

public class Bank {

	public static void main(String[] args) {
		
		SavingAccount acc = new SavingAccount("Raiyan", 500, 425895, 10 );
		acc.showDetails();

	}
	
}
