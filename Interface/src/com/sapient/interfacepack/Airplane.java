package com.sapient.interfacepack;

public class Airplane extends Vehical implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("take off ");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("land ");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly ");
	}

}
