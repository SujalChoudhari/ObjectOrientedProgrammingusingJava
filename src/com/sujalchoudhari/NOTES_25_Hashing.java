package com.sujalchoudhari;

import java.util.*;

public class NOTES_25_Hashing {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>(12,0.4f);   
		
		hashSet.add(10);
		hashSet.add(33);
		hashSet.add(22);
		hashSet.add(20);
		hashSet.add(12);
		System.out.println(hashSet);
		
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>(); 
		hashMap.put(1, 10);
		hashMap.put(2, 12);
		hashMap.put(3, 13);
		hashMap.put(4, 14);
		hashMap.put(5, 15);
		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
	}
}
