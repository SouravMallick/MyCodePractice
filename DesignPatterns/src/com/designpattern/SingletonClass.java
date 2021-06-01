package com.designpattern;

public class SingletonClass {

	// Private Static variable
	private static SingletonClass instance;
	
	//Private Constructor
	private SingletonClass(){}
		
	//Public static method to get the instance
	public static SingletonClass getInstance(){
		if(instance == null){
			synchronized(SingletonClass.class){
				if(instance == null){
					instance= new SingletonClass();
				}
			}
		}
		return instance;
	}
}
