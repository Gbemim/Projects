package linked_lists_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Q2_1 {

	// write a code to remove duplicates from an unsorted linked list
	//use hashtable and doubly linked list

	void removeDuplicates(LinkedListNode n) {
		HashSet<Integer> list = new HashSet<Integer>();
		
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()) {
			i.next();
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2_1 test = new Q2_1();

		LinkedList<Integer> set = new LinkL<Integer>();
		
		
		System.out.println(test.removeDuplicates(set));
		
		
		
		
		
		
		
	}

}
