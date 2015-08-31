/**
 * 
 */
package com.sapient.prac;

import java.awt.print.Printable;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.sun.xml.internal.fastinfoset.sax.Properties;

/**
 * @author mku106
 *
 */

class Data{
	private int num1,num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Data d = (Data)obj;
		
		 return Double.compare(num1, d.num1) == 0
	                && Double.compare(num2, d.num2) == 0;
	
	
	
	
	
}
	
	
	
	
}


class MyDate{
	int dd,mm,yyyy;
	
	public MyDate(int dd, int mm, int yyyy) {
		// TODO Auto-generated constructor stub
		
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
		/*java.util.Date d=null;
	//	java.util.Date d1= null;
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		
		try{
		d = df.parse(dat);
       // d1 = df.format(d);
		}
		catch(Exception ex){
		ex.printStackTrace();
			
		}*/
	}
		
	public MyDate addDays(int days){
		MyDate newDate= new MyDate(dd,mm,yyyy);
		newDate.dd = dd+days;
		return newDate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dd+" "+mm+" "+yyyy;
	}
	
	
		
	}
	
	
	








public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Data d1 = new Data();
		Data d2 = new Data();
		
		d1.setNum1(2);
		d1.setNum2(4);
		
		d2.setNum1(452);
		d2.setNum2(55);
		
		if (d1.equals(d2)) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		MyDate birth= new MyDate(22,7,1964);
		MyDate next_week=  birth.addDays(7);
		System.out.println(next_week);
*/
		
		
	}

}
