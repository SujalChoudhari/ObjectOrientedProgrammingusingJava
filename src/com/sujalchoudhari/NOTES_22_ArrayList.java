package com.sujalchoudhari;

import java.util.*;

public class NOTES_22_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		li.add(10);li.add(33);li.add(22);li.add(20);li.add(12);
		for (int i:li) {
			System.out.println(i);
		}
		System.out.println("---");
		System.out.println(li.get(3));
		
	}
}
