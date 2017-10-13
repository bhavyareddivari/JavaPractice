package interviewDataStructures;

import java.io.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
//bhavya
//ramakanth
//count each chaaracter and also longest word starting and ending with same letter

public class AncestrySolution{
    public static void main(String[] args){
        stringCount();
        
    }
    public static void stringCount(){
        String line = null;
        String longestResult = null;
        int maxLength=0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> longestWordList = new ArrayList<>();
        try{
            File file = new File("/Users/Bhavya/Documents/javapro/Examples/src/InterviewDataStructures/input.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while((line = bufferedReader.readLine())!=null){
                String[] eachWord = line.split(" ");
                for(String word : eachWord){
                    word = word.replaceAll("\\.", "");
                    if(word.charAt(0) == word.charAt(word.length()-1)){
                        longestWordList.add(word);
                    }
                    if(hashMap.containsKey(word)){
                        hashMap.put(word ,hashMap.get(word)+1);
                    }
                    else{
                        hashMap.put(word, 1);
                    }
                }
            }
            
            for(String word : hashMap.keySet()){
               // String key = word.toString();
            	//System.out.println(hashMap.get(word).toString().indexOf(word));
                String value = hashMap.get(word).toString();
                System.out.println(word + " -> " + value);
            }
            for(String longWord : longestWordList){
                int wordLength = longWord.length();
                if(wordLength > maxLength){
                    maxLength = wordLength;
                    longestResult = longWord;
                }
            }
            System.out.println("Longest word that ends and starts with same character: " + longestResult);
        }
        catch(Exception e){
            System.out.println("Program Exited abruptly" + e); 
        }
    }
}