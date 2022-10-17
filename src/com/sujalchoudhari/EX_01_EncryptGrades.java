package com.sujalchoudhari;

public class EX_01_EncryptGrades {
	public static void main(String[] args) {
		char grade = 'B';
		grade = (char)(grade+8);
		System.out.println("Encrypt: "+ grade);
		grade = (char)(grade-8);
		System.out.println("Decrypt: "+ grade);
	}
}