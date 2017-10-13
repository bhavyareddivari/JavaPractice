package interviewPractice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		System.out.println("enter num:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(Factnr(num));	
		sc.close();
    }
	public static int Fact(int num){
		if(num==0)
			return 1;
		while(num!=0){
			return num*Fact(num-1);
		}
		return 0;
	}
	public static int Factnr(int num){
		int res=1;
		if(num==0)
			return 1;
		while(num!=0){
			res=res*num;
			num--;
		}
		return res;
	}
		
}	
