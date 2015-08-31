package com.sapient.lambda;

interface Test{
	public void testing(int i);
}

class Execution{
	public void call(Test test, int value){
		test.testing(value);
	}
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution exec = new Execution();
		exec.call((value)->{
			System.out.println("testing1"+value);
		},3);

	}

}
