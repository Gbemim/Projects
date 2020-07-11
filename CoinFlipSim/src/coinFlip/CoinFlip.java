package coinFlip;

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
	
	
	public int numOfRuns(int n) {
		numOfFlip = n;
		int countH = 0;
		int countT = 0;
		for (int i = 1; i <= n; i++) {
			if (this.headOrTail == 'H') {
				countH =+ 1;
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
