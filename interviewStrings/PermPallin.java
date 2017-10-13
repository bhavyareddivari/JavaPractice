package interviewStrings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PermPallin {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char[] chars = input.toCharArray();
    HashMap<Character, Integer> stringMap = new HashMap<Character, Integer>();
    for(int i = 0; i < input.length(); i++){
        if(!stringMap.containsKey(chars[i])){
            stringMap.put(chars[i], 0);
        }
        if(stringMap.containsKey(chars[i])){
            stringMap.put(chars[i], stringMap.get(chars[i]) + 1);
        }
    }

    int oddCount = 0;
    for(char c: stringMap.keySet()){
        if(stringMap.get(c) % 2 != 0){
            oddCount++;
        }
    }

    if(oddCount > 1){
        System.out.println("NO");
    }else{
        System.out.println("YES");
    }
}
    
}
