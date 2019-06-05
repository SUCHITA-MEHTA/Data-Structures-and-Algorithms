import java.io.*;
import java.lang.*;
import java.util.*;
class Queue{
static int f=0;
static int r=-1;
static void enqueue(int[] arr, int n){
	if(r<arr.length-1){
		r=r+1;
		arr[r]=n;
	}
	else{
		System.out.println("Queue is full");
	}
}
static void dequeue(int[] arr){
	if(r>=f){
		for(int i=f+1;i<=r;i++){
			arr[i-1]=arr[i];
		}
		r=r-1;
	}
	else{
		System.out.println("Queue is empty");
	}
}
static void display(int[] arr){
	System.out.println(r);
	System.out.println("The elements of the queue are as follows:");
	for(int i=f;i<=r;i++){
		System.out.print(arr[i]);
	}
	System.out.println();
}
public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the size of the queue");
	int size=scan.nextInt();
	int[] arr= new int[size];
	int shouldContinue=1;
	while(shouldContinue==1){
		System.out.println("Enter 1 to Enqueue, 2 to dequeue, 3 to display the elements of the queue");
		int choice=scan.nextInt();
		if(choice==1){
			System.out.println("Enter the number you want to enqueue");
			int n=scan.nextInt();
			enqueue(arr,n);
		}
		else if(choice==2){
			dequeue(arr);
		}
		else if(choice==3){
			display(arr);
		}
		else{
			System.out.println("Enter a valid choice");
		}
		System.out.println("Enter 1 to continue");
		shouldContinue=scan.nextInt();
	}
}
}