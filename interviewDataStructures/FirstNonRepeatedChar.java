package interviewDataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = find(str);
		System.out.println(c);
	}
	public static Character find(String str){
		
		char ch= '\0';
		HashMap<Character, Integer> charCount = new HashMap<>();
		for(int i=0; i<str.length();i++){
			ch = str.charAt(i);
			if(!charCount.containsKey(ch)){
				charCount.put(ch,  1);
			}
			else{
				charCount.put(ch, charCount.get(ch)+1);
			}
		}
		for (Character key : charCount.keySet()) {
			  System.out.println(key + " ->  "+ charCount.get(key));
			        }
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(charCount.get(ch) ==1){
				 return ch;
			} 
		}
		return null;
	}
}
