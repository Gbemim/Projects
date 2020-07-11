package coinFlip;

import java.util.Scanner;

public class CoinFlip {
	private char headOrTail;
	private int numOfFlip;
	
	public CoinFlip(int n) {
		numOfFlip = n;
	}
	
	public char headOrTail() {
		double oneOrZero = Math.round(Math.random());
		if (oneOrZero == 1.0) {
			this.headOrTail = 'H';
		} 
		else this.headOrTail = 'T';
		return this.headOrTail;
	}
	
	
	
	public String numOfHeadandTail() {
		int countH = 0;
		int countT = 0;
		
		for (int i = 1; i <= this.numOfFlip; i++) {
			if (headOrTail() == 'H') {
				countH += 1;
			} 
			else countT += 1;
		}	
		
		return "The number of heads: " + countH + "\n"
		+ "The number of tails: " + countT;
	}
	

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many times would you like to flip the coin> ");
		int flip = input.nextInt();
		
		CoinFlip newCase = new CoinFlip(flip);
		System.out.print(newCase.numOfHeadandTail());
	}

}
