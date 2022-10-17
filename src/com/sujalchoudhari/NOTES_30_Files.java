package com.sujalchoudhari;

import java.io.*;
import java.util.Scanner;

public class NOTES_30_Files {

	public static void main(String[] args) {
		File f = new File("textFile.txt");
		
		// Create a file
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//Writing File
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			fw.write("This is a sample Text\n HEllo This is other line");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Reading File
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// deleting file
		f.delete();
		
			

	}

}
