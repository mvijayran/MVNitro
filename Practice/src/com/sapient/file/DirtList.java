/**
 * 
 */
package com.sapient.file;

import java.io.File;

/**
 * @author mku106
 *
 */
public class DirtList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname = "D:/";
		File f = new File(dirname);
		if(f.isDirectory()){
			System.out.println("Directory of"+dirname);
			String s[]=f.list();
			for (int i = 0; i < s.length; i++) {
				File f1 = new File(dirname + "/"+ s[i]);
				if (f1.isDirectory()) {
					System.out.println(s[i]+"is a directory");
				}
				else {
					System.out.println(s[i]+" is a file");
				}
			}
		}
		else
		{
			System.out.println(dirname+ " is not a directory");
		}
			

	}

}
