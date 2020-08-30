package array_and_strings_1;

import java.util.ArrayList;
import java.util.List;

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
	
	
	
	
	public static <T extends Comparable <? super T>> void selectionSortRecursive(List <T> list){
		if(list.size() < 2) {
			return;
		}
		else {
			selectionSortRecursive(list.subList(1,list.size()));
				if(list.get(1).compareTo(list.get(0)) < 0) {
				list.set(0, list.get(1));
				list.set(1, list.get(0));
			}
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Q1_2 test = new Q1_2();
		System.out.println(test.checkPermutation("Gbemi", "Strong"));
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(88);
		list.add(6);
		list.add(11);

		selectionSortRecursive(list);
	
		
	}

}























