package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedStream {
	
	public static void main(String[] args) {
		
		String filename = "./bufferedExample.txt";
		writeCharacterStream(filename);
		readCharacterStream(filename);
		
		System.out.println("Done!");
		
		
	}

	private static void readCharacterStream(String filename) {


		try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
			
			
			String line = "";
			while((line = reader.readLine())!= null) {
				System.out.println(line);
			}
			}catch(Exception e){
				//nothing
		}
		
	}

	private static void writeCharacterStream(String filename) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
			
			
			writer.write("Hi There! \n");
			writer.write("Buffered streams are faster and easier!\n");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
