package com.ds;

public class LinkedList {

	public static void main(String[] args) {
		Node head=new Node(10);
		Node temp1=new Node(20);
		Node temp2=new Node(30);
		
		head.next=temp1;
		temp1.next=temp2;
		head = insertAtBegining(head,0);
		insertAtEnd(head,50);
		traverse(head);
		recursiveTraverse(head);
	}
	
	//Print Elements of linked list
	public static void traverse(Node head){
		Node curr=head;
		while(curr != null){
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	// Print elements using recursion
	public static void recursiveTraverse(Node head){
		
		if(head != null){
			System.out.println(head.data);
			recursiveTraverse(head.next);
		}
	}
	
	// Insert at beginning
	public static Node insertAtBegining(Node head,int data){
		Node temp=null;
		if(head == null){
			temp=new Node(data);
		}else{
			temp=new Node(data);
			temp.next=head;
		}
		return temp;
	}
	
	// Insert at end
		public static void insertAtEnd(Node head,int data){
			Node temp=null;
			if(head == null){
				temp=new Node(data);
			}else{
				while(head.next != null)
					head=head.next;
				temp=new Node(data);
				head.next=temp;
			}
		}
}
