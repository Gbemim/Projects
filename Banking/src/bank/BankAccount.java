package bank;

import java.util.Scanner;

public class BankAccount extends Exception {

	int balance, lastTransaction;
	String name, id;
	
	public BankAccount(String exception) { }
	
	public BankAccount(String name, String id, int balance, int perviousTransaction) {
		super();
		this.balance = balance;
		this.id = id;
		this.name = name;
		lastTransaction = perviousTransaction;
	}
	
	void deposit(int amount) {
		if(amount > 0 ) {
			balance =+ amount;
			lastTransaction = amount;
		} else throw new IllegalArgumentException("Amount must be greater than 0");
		

	}
	
	void withdraw(int amount) {
		try {
			if(balance > 0) {
				balance =- amount;
				lastTransaction = -amount;
			}
			if (balance <= 0) {
				BankAccount exception = new BankAccount("The balance of your account is 0");
				throw exception;
			}
		}
		catch(BankAccount e) {
			e.printStackTrace();
		}
	}
	
	
	void getPreviousTransactions() {
		if(lastTransaction > 0) {
			System.out.println("Deposited: " + lastTransaction);
		}
		else if(lastTransaction < 0) {
			System.out.println("Withdrawn: " + lastTransaction * -1);
		}
		else System.out.println("No transaction occured");
	}
	
	void menu() {
		char[] option = {'\0'};
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome " + name);
		System.out.println("Your ID is " + id + "\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do
		
		
		System.out.println();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
