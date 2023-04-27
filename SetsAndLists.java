package day1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsAndLists {

	public static void main(String[] args) {
		
		//Set does not care about position, but that it exist.
		//Treeset is ordered, while Hashset is unordered.
		//Set<Integer> t = new HashSet<Integer>();
		
		Set<Integer> t = new TreeSet<Integer>();
		t.add(5);
		t.add(9);
		t.add(7);
		t.add(5);
		t.add(-6);
		t.add(13);
		t.remove(7);
		
		
		boolean x = t.contains(5);
		
		System.out.println(t);
	}

}
