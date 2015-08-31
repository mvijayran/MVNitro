package com.sapient.cui.generics;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setStreet("Park street");
		address.setCountry("India");
		
		try{
			FileOutputStream fout = new  FileOutputStream("D:\\address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.out.println("done");
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
