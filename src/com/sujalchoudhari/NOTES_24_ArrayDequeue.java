package com.sujalchoudhari;

import java.util.*;

public class NOTES_24_ArrayDequeue {

	public static void main(String[] args) {
		ArrayDeque<Integer> arr = new ArrayDeque<Integer>(10);
		arr.add(10);
		arr.add(33);
		arr.add(22);
		arr.add(20);
		arr.add(12);
		arr.addLast(100);
		arr.addFirst(300);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		System.out.println(arr.contains(22));
	}

}
