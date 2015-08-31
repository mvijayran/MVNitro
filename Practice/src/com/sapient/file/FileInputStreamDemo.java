/**
 * 
 */
package com.sapient.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream;

/**
 * @author mku106
 *
 */
public class FileInputStreamDemo  {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int size;
		InputStream f = new FileInputStream("D:/Workspace/MVNitro/Practice/src/com/sapient/file/FileInputStreamDemo.java");
		System.out.println("Total available bytes"+ (size=f.available()));
		
		int n=size/40;
		System.out.println("first"+ n+"byets of the file one read() at the time");
		for (int i = 0; i < args.length; i++) {
			System.out.println(f.read());
		}
		System.out.println("\n still available : "+ f.available());
		System.out.println("Reading the next"+n+"with one read(b[])");
		
		byte b[] = new  byte[n];
		
		if (f.read(b)!=n) {
			System.err.println("couldn't read"+ n + "bytes.");
			
			
			
		}
		
		System.out.println(new String(b,0,n));
		System.out.println("\n still available : "+ f.available());
		System.out.println("skipping half bytes");
		f.skip(size/2);
		System.out.println("\n still available : "+ f.available());
		System.out.println("reading"+n/2+"into the end of array");
		if (f.read(b,n/2,n/2) !=n/2) {
			System.err.println("couldn't read"+ n/2+"bytes.");
			
		}
		
		System.out.println(new String(b,0,b.length));
		System.out.println("\n still available : "+ f.available());
		f.close();
		
		

	}

}
