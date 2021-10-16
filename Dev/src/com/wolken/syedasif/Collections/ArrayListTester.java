package com.wolken.syedasif.Collections;
import java.util.*;

public class ArrayListTester {
	void display(ArrayList arraylist) {
		for(int i=0;i<arraylist.size();i++)
			System.out.print(arraylist.get(i)+" ");
		System.out.println();
	}
	public static void main(String args[]) {
		ArrayListTester alt = new ArrayListTester();
		ArrayList arraylist = new ArrayList();
		ArrayList b = new ArrayList();
		b.add("one");
		b.add("two");
		b.add("three");
		b.add("one");
		arraylist.add("Hello");
		arraylist.addAll(b);
		System.out.println(arraylist.lastIndexOf("one"));
		Collections.sort(arraylist);
		alt.display(arraylist);
		arraylist.clear();
		System.out.println(arraylist.isEmpty());
		arraylist.add("Hello");
		arraylist.addAll(b);
		System.out.println(arraylist.contains("one"));
		System.out.println(arraylist.indexOf("one"));
		arraylist.set(1, "five");
		alt.display(arraylist);
		arraylist.remove(3);
		alt.display(arraylist);
		arraylist.removeAll(b);
		alt.display(arraylist);
		System.out.println(arraylist.containsAll(b));
		alt.display(arraylist);
		System.out.println(arraylist.toArray());
	}
}
