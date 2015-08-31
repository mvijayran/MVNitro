/**
 * 
 */
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author mku106
 * 
 */

class Employee {
	public void netSal() {
		System.out.println("employee salary");
	}
	
	public int sum(int... num )
	{
		int sum=0;
		for (int i : num) {
			sum+=i;
		}
		return sum;
	}

}

class Intern extends Employee {
	public void netSal() {
		System.out.println("Intern stipend");
	}
}

class Confermed extends Employee {
	public void netSal() {
		System.out.println(" confermed employee salary");
	}

	public void transport() {
		System.out.println("transport function");
	}
}

class hr {
	public Employee recruit(String emp) {
		if (emp.equals("i")) {
			return new Intern();
		} else if (emp.equals("c"))
			return new Confermed();

		return null;
	}

}

enum Apple{
	Jonathan, RedDel
}

public class PracMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	hr hr = new hr();
		Employee employee = hr.recruit("i");
		if (employee != null)

			employee.netSal();

		employee = hr.recruit("c");
		if (employee != null) {

			employee.netSal();

			if (employee instanceof Confermed) {
				Confermed con = (Confermed) employee;
				con.transport();
			}
		}
		
		Employee emp=new Employee();
	//System.out.println(emp.sum(15,20,21,35,12,25,12));	
	
		
		Apple ap;
		Apple all[]= Apple.values();
		for (Apple apple : all) {
			System.out.println(apple);
		}
		
		ap= Apple.valueOf("RedDel");
		System.out.println("ap constraints "+ap);
		*/
		//FileInputStream in;
		//FileOutputStream out;
		
		try(
			FileInputStream in = new FileInputStream("sapin.txt");
			FileOutputStream out = new FileOutputStream("sapout.txt");
		)
		{
			int c;
			while((c=in.read())!=-1)
				out.write(c);
			
			
			
		} catch (  IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
