package com.demo;

public class PrintNumberSequential {

// Create 3 Threads and Print 1-10 by these threads in Sequential order
	
	public static void main(String[] args){
		
		PrintThread runnable1 = new PrintThread(1);
		PrintThread runnable2 = new PrintThread(2);
		PrintThread runnable3 =new PrintThread(0);
		
		Thread t1=new Thread(runnable1,"T1");
		Thread t2=new Thread(runnable2,"T2");
		Thread t3=new Thread(runnable3,"T3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	static class PrintThread implements Runnable{
		 static int count =1;
		int remainder;
		static Object lock=new Object();
		
		public PrintThread(int remainder){
			this.remainder=remainder;
		}
		
		@Override
		public void run() {
			
			while(count  < 9){
				synchronized (lock) {
					while(count%3 != remainder){
						try{
							lock.wait();
						}catch(InterruptedException e){
							e.printStackTrace();
						}
						
					}
					System.out.println(Thread.currentThread().getName()+" "+count);
					count++;
					lock.notifyAll();
				}
			}
			
		}
		
	}
	
}
