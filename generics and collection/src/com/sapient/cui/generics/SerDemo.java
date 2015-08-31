package com.sapient.cui.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 

class Sample implements Serializable{
	String s;
	int i;
	double d;
	public  Sample(String s,int i,double d)
	{
		this.s=s;
		this.i=i;
		this.d=d;
	}
	@Override
	public String toString() {
		return "Sample [s=" + s + ", i=" + i + ", d=" + d + "]";
	}
	
}

public class SerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Sample object1 = new Sample("hi",-7,2.5);
			System.out.println("object1 : "+object1);
			FileOutputStream fos = new FileOutputStream("store");
			ObjectOutputStream oos=  new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception : "+e);
			System.exit(0);
		}
		
		try{
			Sample object2;
			FileInputStream fin = new FileInputStream("store");
			ObjectInputStream ois = new ObjectInputStream(fin);
			object2 = (Sample)ois.readObject();
			ois.close();
			System.out.println("object 2 is: "+object2);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e);
			System.exit(0);
			
		}

	}

}


