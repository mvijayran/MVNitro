package com.sapient.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = " now is the time for all good men\n"+"to come to the aid of their country";
		byte buf[]= source.getBytes();
		OutputStream f;
		try {
			f = new FileOutputStream("file1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < buf.length; i+=2) {
			f.write(buf[i]);
		}
		f.close();

	}

}
