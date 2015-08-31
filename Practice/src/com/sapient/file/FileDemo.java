/**
 * 
 */
package com.sapient.file;

import java.io.File;

/**
 * @author mku106
 *
 */
public class FileDemo {
	
	static void p(String s){
		System.out.println(s);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("D:/sapient.txt");
		p("file name:"+f1.getName());
		p("path:"+f1.getPath());
		p("Abs Path:"+f1.getAbsolutePath());
		p("parrent: "+ f1.getParent());
		p("is file exist:"+f1.exists());
		p("is file redable: "+f1.canRead());

		p("is file writeable: "+f1.canWrite());
		p("is a directory"+f1.isDirectory());

		p("is normal file"+f1.isFile());

		p("is absolute : "+f1.isAbsolute());
		

		p("file last modified"+f1.lastModified());
		
	}

}
