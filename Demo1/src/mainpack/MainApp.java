package mainpack;

import java.util.Calendar;

class Process{
	public int[] create()
	{
		int[] num=new int[10];
		num[3]=19;
		return num;
		
	}
	
	public void display(int[] src)
	{
		for(int data:src);
			//System.out.println(data);
	}
}

class Point{
	int num1 , num2;
	
	Point(int var1,int var2)
	{
		num1=var1;
		num2=var2;
	}
}

class IllegalAgeException extends Exception{
	
	public String getMessage(){
		return "u need to be 18 and above";
	}
	
	
	
}

class Vote{
	public void register(int age) throws IllegalAgeException {
		if(age<18)
		{
			throw new IllegalAgeException();
		}
		
		System.out.println("you can vote");
	}
}





public class MainApp {

	public static void main(String[] args) {
		
		
		Vote vote = new Vote();
		try {
			vote.register(16);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
/*	Process p =new Process();
	int[] num1=p.create();
	p.display(num1);
	
	int[][][] num= new int[5][3][2];
	
	num[2][1][1]=3;
	for (int[][] dim1 : num) {
		for (int[] dim2 : dim1) {
			for (int dim3 : dim2) {
				//System.out.print( " "+dim3);	
			}
				
		}
		
		
	}
	
	Point [] p1=new Point[10];
	for (int i = 0; i < p1.length; i++) {
		p1[i]=new Point(i, i+1);
	}
	
//	System.out.println("here it is "+p1[0].num1 + p1[0].num2);
	
	int[] arr1=new int[10];
	int[] arr2=new int[15];
	
	arr1[0]=2;
	arr1[9]=10;
	
	System.arraycopy(arr1, 0, arr2, 2, 10);
	
	for (int i : arr2) {
		System.out.print(" "+i);
	}
	
	*/
		
		
		
		
	}

}
