package com.example;

import java.io.FileReader;
import java.io.FileWriter;

public class ChracterStream {
	
	//I'll be teaching you to write each character in human readable language onto a file 

	public static void main(String[] args) {
		


		String filename = "./charExample.txt";
		
		writeCharacterStream(filename);
		readCharacterStream(filename);

	}
	
	
	public static void readCharacterStream(String filename) {
		
		try {
			FileReader reader = new FileReader(filename);
			int i;
			while ((i = reader.read())!= -1) { //if a character does not exist, it will return -1. So we're are checking that it does not equal -1
				System.out.println((char) i);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void writeCharacterStream(String filename) {
		
		try { //Risky code goes into try block 
			FileWriter writer = new FileWriter(filename, true); //Checked Exception 
			
			for(int i = 65; i< 82; i++) {
				writer.write(i);
			}
			
			writer.close();
			
		} catch(Exception e) {
			//catch executes when an exception is thrown!
			e.printStackTrace();
		}
		
		
		
		
	}

}
