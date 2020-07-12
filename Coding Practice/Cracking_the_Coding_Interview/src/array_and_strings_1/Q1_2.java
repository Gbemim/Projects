package array_and_strings_1;

public class Q1_2 {

	
	public String checkPermutation(String word1, String word2) {
		StringBuilder addChar = new StringBuilder();
		
		String[] array1 = word1.split("");
		String[] array2 = word1.split("");
		
		for (String word : array1) {
			addChar.append(word);
//			if(addChar.charAt(2));
			
		}
			return addChar.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Q1_2 test = new Q1_2();
		System.out.println(test.checkPermutation("Gbemi", "Strong"));
		
	
		
	}

}























