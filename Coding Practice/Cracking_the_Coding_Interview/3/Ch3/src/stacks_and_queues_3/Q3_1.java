package stacks_and_queues_3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Three in One: Describe how you could a single array to implement three stacks

public class Q3_1 {	
	public ListIterator<Integer> push(int num) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(num);
		return array.listIterator();
	}

	public static void main(String[] args) {
		Q3_1 test = new Q3_1();
		test.push(22);
		test.push(42);
		test.push(21);
		
		for(int i = 0; i < test.)
		System.out.println(test.push(a));

	}

}
