package com.sapient.cui.generics;



class Data<T>{
	 private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	 
}

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data<Integer> d = new Data<Integer>();
		d.setValue(new Integer(25));
		System.err.println(d.getValue()); 
		
	}

}
