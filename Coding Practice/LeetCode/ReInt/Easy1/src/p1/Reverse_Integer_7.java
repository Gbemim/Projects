package p1;

public class Reverse_Integer_7 {

	public int reverse(int x) {
		if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
			return 0;
		}
		
		String change = String.valueOf(x);
		char[] changeChar = change.toCharArray();
		
		if (changeChar[0] == '-') {
			char[] result = new char[changeChar.length];
			
			for(int i = 1; i < changeChar.length; i++) {
				result[i] = changeChar[i-1]; 
			}
			changeChar = result;
		}
			
		StringBuilder newA = new StringBuilder(100);
		
		for(int i = changeChar.length - 1; i >= 0; i--) {
			if (changeChar[0] == 0 || (changeChar[0] == 0 && changeChar[1] == 0)) 
				return Integer.valueOf(newA.toString());
			
			
			String newArray = String.valueOf(changeChar[i]);
			newA.append(newArray);
		}
		
		
		
		return Integer.valueOf(newA.toString());
//		System.out.print(Integer.valueOf(newA.toString()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_Integer_7 test = new Reverse_Integer_7();
		test.reverse(-120);
	}

}
