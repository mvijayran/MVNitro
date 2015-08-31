package com.sapient.threads;


class Runner implements Runnable{
	
	Data data;
	private Thread secondThread;
	public Runner() {
	data = new Data();
	}
	 
		public void run() {
			
			Thread currThread;
			for (int counter = 0; counter < 10; counter++) {
				currThread = Thread.currentThread();
				
				if (currThread.getName().equals("Producer")) {
					System.out.println(currThread);
					synchronized (data) {
						data.setValue(counter+1);
						data.notify();
						if(!secondThread.isAlive()){
							secondThread.start();
						}
						try {
							data.wait(50000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				else if(currThread.getName().equals("Consumer")){
					System.out.println(currThread);
					
					synchronized (data) {
						data.getValue();
						data.notify();
						try {
							data.wait(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
			}
			
		}
		
		public void setSecondThread(Thread secondThread){
			this.secondThread= secondThread;
		}
	
}


class Data{
	private int value;

	public void getValue() {
		System.out.println(value);
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runner runner= new Runner();
		Thread firstThread = new Thread(runner,"Producer");

		Thread secondThread = new Thread(runner,"Consumer");
		
		firstThread.start();
		runner.setSecondThread(secondThread);
		//secondThread.start();
		
		
		
		
		
		
		
		System.out.println("the end");

	}

}
