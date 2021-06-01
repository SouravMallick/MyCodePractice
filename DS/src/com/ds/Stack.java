package com.ds;

public class Stack {

	public static void main(String[] args) {
		Node head=new Node(1);
		Node tmp1=new Node(2);
		Node tmp2=new Node(3);
		head.next=tmp1;
		tmp1.next=tmp2;
		print(head);
		head=push(head,4);
		print(head);
		head=pop(head);
		print(head);
		System.out.println("Is Stack empty :"+isEmpty(head));
		System.out.println("Stack size :"+size(head));

	}
	
	// Print elements using recursion
		public static void print(Node head){
			
			if(head != null){
				System.out.println(head.data);
				print(head.next);
			}
		}
	public static Node push(Node head,int num){
		if(head == null){
			Node tmp = new Node(num);
			System.out.println("Push element="+tmp.data);
			return tmp;
		}else{
			Node tmp = new Node(num);
			tmp.next=head;
			System.out.println("Push element="+tmp.data);
			return tmp;
		}	
	}
	
	public static Node pop(Node head){
		if(head == null){
			System.out.println("Stack is empty.");
			return head;
		}else{
			Node tmp=head.next;
			System.out.println("Pop element="+head.data);
			head.next=null;
			return tmp;
		}	
	}
	
	public static boolean isEmpty(Node head){
		if(head == null)
			return true;
		else
			return false;
	}
	
	public static int size(Node head){
		int length=0;
		System.out.println("------------");
		if(head == null){
			System.out.println("------------"+length);
			return length;
		}else{
			while(head.next !=null){
				length++;
			}
			return length;
		}
	}

}
