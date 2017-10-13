package interviewPractice;

import java.util.Scanner;

public class StringPalli {
	public static void main(String[] args){
		System.out.println("enter num:");
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(hello(str));	
		sc.close();
    }
	public static String Pallin(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		//System.out.println(rev);
		if(s.equals(rev)){
			return "Pallindrome";
		}
		else
			return "Not pallindrome";
	}
	public static String hello(String s){
		if(s.length()<2)
			return s;
		return hello(s.substring(1)) + s.charAt(0);
	}
}
