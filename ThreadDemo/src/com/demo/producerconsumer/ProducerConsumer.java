package com.demo.producerconsumer;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer {

	List<Integer> list=new LinkedList<Integer>();
	int capacity=5;
	
	public void produce() throws InterruptedException{
		int value=0;
		
		while(value <10){
			synchronized (this) {
			
			while(list.size() == capacity){
				wait();
			}
			System.out.println("Producer produce :"+value);
			list.add(value);
			value++;
			notify();
			
			Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException{
		while(true){
			synchronized (this) {
				
				while(list.size() == 0){
					wait();
				}
				int value =((LinkedList<Integer>) list).removeFirst();
				System.out.println("Consumer consume :"+value);
				
				notify();
				
				Thread.sleep(1000);
			}
		}
	}
}
