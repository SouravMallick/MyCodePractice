package com.practice;

public class A {

	public static void main(String[] args) {
		int test=1;
		class B{
			void abc(){
				System.out.println(test);
			}
		}
		
		B b=new B();
		b.abc();
	}

}
