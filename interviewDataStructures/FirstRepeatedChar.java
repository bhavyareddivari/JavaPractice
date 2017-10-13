package interviewDataStructures;

import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class FirstRepeatedChar {

	public static void main(String[] args) throws IOException{
		String line;
        File file = new File("/Users/Bhavya/Documents/javapro/Examples/src/InterviewDataStructures/input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        while((line=buffer.readLine())!=null){
        	char c = find(line);
    		System.out.println(c);
        }
		
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
