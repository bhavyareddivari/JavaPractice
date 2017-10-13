package interviewDataStructures;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
//hw it works????? chck
public class PrintUniqueNumbers {
    public static void main (String[] args) throws IOException {
    	ArrayList<Integer> result = new ArrayList<>();
        String line = "1 5 1 5 7 1 1 1 6 4";
        line = line.trim();
        		HashMap<Character, Integer> uniqueMap = new HashMap<>();
        		for(int i=0; i<line.length(); i++){
        			char ch= line.charAt(i);
        			if(!uniqueMap.containsKey(ch)){
        				uniqueMap.put(ch, 1);
        			}
        			else{
        				uniqueMap.put(ch, uniqueMap.get(ch)+1);
        			}
        		}
        		for(Character word : uniqueMap.keySet()){
        			if(uniqueMap.get(word) == 1){
        				//System.out.println(word);
        				result.add(Character.getNumericValue(word));
        			} 
                 }
        		if(!result.isEmpty())
        			System.out.print(Collections.min(result) -1 );
        		else
        			System.out.println(0);
    }
}


