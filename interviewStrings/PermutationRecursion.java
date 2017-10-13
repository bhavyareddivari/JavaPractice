package interviewStrings;

import java.util.Scanner;

public class PermutationRecursion {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		perm(str);
	}
	public static void perm(String str){
		printPerm("", str);
	}
	//passing empty string as current permutation to start with
	public static void printPerm(String perm, String word){
		if(word.isEmpty()){
			System.out.print(perm + word+",");
		}else{
			for(int i=0; i< word.length();i++){
				printPerm(perm + word.charAt(i) , word.substring(0,i)+ word.substring(i+1, word.length()));
			}
		}
	}
}

