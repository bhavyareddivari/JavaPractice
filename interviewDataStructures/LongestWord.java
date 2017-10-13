package interviewDataStructures;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LongestWord{
    public static void main(String[] args){
        stringCount();
        
    }
    public static void stringCount(){
        String line = null;
        String longestResult = null;
        int maxLength=0;
        int min =0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> longestWordList = new ArrayList<>();
        try{
            File file = new File("/Users/Bhavya/Documents/javapro/Examples/src/InterviewDataStructures/hello");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while((line = bufferedReader.readLine())!=null){
            	//System.out.println(line);
                String[] eachWord = line.split(" ");
                for(String word : eachWord){
                    word = word.replaceAll("\\.", "");   
                    int length = word.length();
                    hashMap.put(word ,length);
                }
            
	            for(String word : hashMap.keySet()){
	                if(hashMap.get(word) > min){
	                	min = hashMap.get(word);
	                }
	            }
	            for(String word : hashMap.keySet()){
	            	if(hashMap.get(word) == min){
	            		System.out.println(word);
	            		break;
	            	}
	            }
	            hashMap.clear();            
            }
            
        }
        
        catch(Exception e){
            System.out.println("Program Exited abruptly" + e); 
        }
    }
}