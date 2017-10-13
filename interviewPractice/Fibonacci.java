package interviewPractice;

import java.util.Scanner;

public class Fibonacci {

	   public static void main(String[] args){
		System.out.println("enter num:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
			System.out.print(fib(i)+ " ");
		
	}
	
	public static int fib(int n){
		if(n==1 || n==2)
			return 1;
		int x=1, y=1, temp=1;
		for(int i=3; i<=n ; i++){
			temp=x+y;
			x=y;
			y=temp;
		}
		return temp;
	}
	
	public static int fibRec(int n){
		if(n==1 || n==2){
			return 1;
		}
		return fibRec(n-1)+fibRec(n-2);
	}
}
