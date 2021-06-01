package com.demo.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> bqueue=new ArrayBlockingQueue<Integer>(4);
		
		Producer producer=new Producer(bqueue);
		Consumer consumer=new Consumer(bqueue);
		
		Thread pthread=new Thread(producer);
		Thread cthread=new Thread(consumer);
		
		pthread.start();
		cthread.start();
	}

}

class Producer implements Runnable{
	BlockingQueue<Integer> bqueue;
	
	public Producer(BlockingQueue<Integer> bqueue){
		this.bqueue=bqueue;
	}
	@Override
	public void run() {
		for(int i=1;i<4;i++){
			try {
				bqueue.put(i);
				System.out.println("Produced = "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Consumer implements Runnable{

	BlockingQueue<Integer> bqueue;
	int taken=-1;
	public Consumer(BlockingQueue<Integer> bqueue){
		this.bqueue=bqueue;
	}
	
	@Override
	public void run() {
		while(taken !=4){
			try {
				taken = bqueue.take();
				System.out.println("Consumed = "+taken);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
