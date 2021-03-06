package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.model.Planet;

public class SerializationDemo {
	
	/*
	 * Serialization:
	 * 		Converting the states of an onject into byte stream and persisting in a text file!
	 * 
	 * Deserialization:
	 * 		Converting byte stream to recreate Java objects in memory
	 * 
	 * How is this achieved? 
	 * 		Via the Serializabe interface. (which is a marker interface)
	 * 		ObjectOutputStream class
	 * 		ObjectInputStream
	 * 	
	 */
	public static void main(String[] args) {
		
		/*
		 * <read file to get menuitems>
		 * 
		 * before project readObject();
		 * example project 
		 */
		
		String filename = "./samplePlanetFile.txt";
		Planet p = new Planet(12,"Mercury");
		
		writeObject(filename, p);
		readObject(filename);
		
		System.out.println("Done!");
		
		/*
		 * write data to be persisted into a file 
		 * writeObject();
		 */
		
	}

	private static void readObject(String filename) {
		
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream(filename));
			
			Planet p = (Planet) ois.readObject();
			System.out.println(p);
			
			
		}catch (Exception e) {
			System.out.println("Something terrible happened!");
		} finally {
			
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static void writeObject(String filename, Planet p) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			//try with resources
			// The resouces inside the paranethiss will be closed after the try catch block executes!
			oos.writeObject(p);
			oos.close();
			
		}catch(Exception e) {
			System.out.println("Something terrible happened!");
			e.printStackTrace();
		}
		
	}

}
