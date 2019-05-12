import java.io.*;
import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class LinkedList{
	public static Node insertHead(Node head, int data){
		Node current= head;
		head = new Node(data);
		head.next=current;
		return head;
	}
	public static Node insertEnd(Node head, int data){
		Node current=head;
		if(head==null){
			head=new Node(data);
			head.next=null;
		}
		else if(head.next==null){
			head.next=new Node(data);
			current=head.next;
			current.next=null;
		}
		else{
			while(current.next!=null){
				current=current.next;
			}
			current.next=new Node(data);
		}
		return head;
	}
	public static Node insertPosition(Node head, int data, int pos){
		Node current=head;
		Node previous=current;
		int i=0;
		if(head==null){
			head=new Node(data);
			head.next=null;
		}
		else{
			if(pos!=0){
			while(i!=pos-1 && current.next!=null){
				current=current.next;
				previous=current;
				i=i+1;
			}
			current=current.next;
			Node n= new Node(data);
			n.next=current;
			previous.next=n;
		}
		if(pos==0){
			Node n= new Node(data);
			n.next=current;
			head=n;
		}
	}
		return head;
	}
	public static Node deleteHead(Node head){
		if(head==null||head.next==null){
			return null;
		}
		else{
			head=head.next;
		}
		return head;
	}
	public static Node deleteEndNode(Node head){
			if(head==null||head.next==null){
			return null;
		}
		else{
			Node current=head.next;
			Node previous=head;
			while(current.next!=null){
				current=current.next;
				previous=previous.next;
			}
			previous.next=null;
		}
		return head;
	}
	public static Node deleteNodeByPosition(Node head, int pos){
		if(pos==0){
			head=head.next;
		}
		if(head==null||head.next==null){
			return null;
		}
		if(pos>0){
			int i=0;
			Node current= head;
			Node previous=head;
			while(current.next!=null && i!=pos){
				previous=current;
				current=current.next;
				i=i+1;
			}
			previous.next=current.next;
			current.next=null;
		}
		return head;
	}
	public static Node deleteByValue(Node head, int val){
		Node current= head;
		Node previous=head;
		int pos=0;
		while(current!=null){
			if(current.data==val && pos==0){
				head=head.next;
				break;
			}
			if(current.data==val && pos>0){
				previous.next=current.next;
				current.next=null;
				break;
			}
			previous=current;
			current=current.next;
			pos=pos+1;
		}
		return head;
	}
	public static int totalNumberOfNodes(Node head){
		Node cur=head;
		int number=0;
		while(cur!=null){
			cur=cur.next;
			number=number+1;
		}
		return number;
	}
	public static void main(String[] args){
		int n;
		Scanner scan= new Scanner(System.in);
		n=1;
		Node head=null;
		while(n==1){
			System.out.println("Press 1 for inserting at head, 2 for inserting at last position and 3 for inserting at any given position, 4 for deleting head, 5 for deleting end and 6 for deleting from a given position, 7 for deleting by a value, 8 for returnking the total number of nodes in the linked list");
			int k=scan.nextInt();
			if(k==1){
				System.out.println("Insert the value you want to enter");
				int t= scan.nextInt();
				head=insertHead(head, t);
				Node cur=head;
				while(cur!=null){
					System.out.print(cur.data);
					cur=cur.next;
				}
				System.out.println();
			}
			if(k==2){
				System.out.println("Insert the value you want to enter");
				int l= scan.nextInt();
				head=insertEnd(head, l);
				Node cur=head;
				while(cur!=null){
					System.out.print(cur.data);
					cur=cur.next;
				}
				System.out.println();
			}
			if(k==3){
				System.out.println("Insert the value you want to enter");
				int p= scan.nextInt();
				System.out.println("Enter the position at which you want to insert the value");
				int pos=scan.nextInt();
				head=insertPosition(head, p, pos);
				Node cur= head;
				while(cur!=null){
					System.out.print(cur.data);
					cur=cur.next;
				}
				System.out.println();
			}
			if (k==4) {
				head=deleteHead(head);
				Node cur= head;
				while(cur!=null){
					System.out.print(cur.data);
					cur=cur.next;
				}				
			}
			if(k==5){
				head=deleteEndNode(head);
				Node cur= head;
				while(cur!=null){
					System.out.print(cur.data);
					cur=cur.next;
				}		
			}
			if(k==6){
				System.out.println("Enter the position you want to delete from");
				int h=scan.nextInt();
				head=deleteNodeByPosition(head, h);
				Node cur= head;
				while(cur!=null){
					System.out.print(cur.data);
					cur=cur.next;
				}
			}
			if(k==7){
				System.out.println("Enter the value you want to delete");
				int b= scan.nextInt();
				head= deleteByValue(head,b);
				Node cur = head;
				while(cur!=null){
					System.out.print(cur.data);
					cur=cur.next;
				}				
			}if(k==8){
				System.out.println(totalNumberOfNodes(head));
			}
			System.out.println("Enter 1 to continue");
			n=scan.nextInt();
		}
	}
}
