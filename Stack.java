import java.io.*;
import java.util.*;
import java.lang.*;
class Stack{
	static int top=-1;
	static void push(int[] arr, int n){
		if(top+1<arr.length){
			top=top+1;
			arr[top]=n;
			System.out.println("Element successfully added to the stack");
		}
		else{
			System.out.println("The stak is full");
		}
	}
	static void pop(int[] arr){
		if(top>=0){
			top=top-1;
			System.out.println("Element successfully deleted");
		}
		else{
			System.out.println("The stack is empty");
		}
	}
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int n=scan.nextInt();
		int[] arr= new int[n];
		int shouldContinue=1;
		while(shouldContinue==1){
			System.out.println("Enter 1 to push element and 0 to pop an element");
			int choice=scan.nextInt();
			if(choice==1){
				System.out.println("Enter the number you want to push");
				int k=scan.nextInt();
				push(arr,k);
			}
			if(choice==0){
				pop(arr);
			}
			System.out.println("The stack after performing the operations is:");
			for(int i=top;i>=0;i--){
				System.out.print(arr[i]);
			}
			System.out.println();
			System.out.println("Enter 1 to continue");
			shouldContinue=scan.nextInt();
		}
	}
}