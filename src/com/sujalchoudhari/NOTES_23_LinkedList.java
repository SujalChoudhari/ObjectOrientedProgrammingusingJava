package com.sujalchoudhari;

import java.util.*;

public class NOTES_23_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();

		li.add(10);
		li.add(33);
		li.add(22);
		li.add(20);
		li.add(12);
		li.addLast(100);
		li.addFirst(300);
		for (int i : li) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		System.out.println(li.contains(22));

	}

}
