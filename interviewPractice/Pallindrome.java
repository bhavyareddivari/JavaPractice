package interviewPractice;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args){
		System.out.println("enter num:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(Pallin(num));	
		sc.close();
    }
	public static String Pallin(int num){
		int rem=0,rev =0;
		int ori=num;
		while (num!=0){
			rem=num%10;
			rev= rev*10+rem;
			num=num/10;
		}
		if(ori==rev){
			return "Pallindrome";
		}
		else
			return "Not pallindrome";
	}
}	
