package coinFlip;

import java.util.Scanner;

public class CoinFlip {
	private char headOrTail;
	private int numOfFlip;
	
	public CoinFlip(int n) {
		numOfFlip = n;
	}
	
	public void headOrTail() {
		double oneOrZero = Math.round(Math.random());
		if (oneOrZero == 1.0) {
			this.headOrTail = 'H';
		} 
		else this.headOrTail = 'T';
	}
	
	
	public int numOfHead() {
		int countH;
		System.out.println(this.numOfFlip);
		countH = 0;
		for (int i = 1; i <= this.numOfFlip; i++) {
			if (this.headOrTail == 'H') {
				countH = countH + 1;
			}
		}	
		System.out.println(countH);
		return countH;
	}
		
	public int numOfTail() {
		int countT = 0;
		for (int i = 1; i <= this.numOfFlip; i++) {
			if (this.headOrTail == 'T') {
				countT =+ 1;
			}	
		}	
		return countT;
	}
	
	
	@Override
	public String toString() {
		return "The number of heads: " + numOfHead() + "\n"
				+ "The number of tails: " + numOfTail();
	}

	

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many times would you like to flip the coin> ");
		int flip = input.nextInt();
		
		CoinFlip newCase = new CoinFlip(flip);
		System.out.print(newCase.numOfHead());
	}

}
