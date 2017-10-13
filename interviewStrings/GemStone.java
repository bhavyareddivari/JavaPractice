package interviewStrings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
 * 3
abcdde
baccd
eeabg

o/p: 2(common repetivive count)
 * 
 * 
 */
public class GemStone {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.*/
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        int [] arrayChars = new int[26];
        Set<Character> set = new HashSet<>();
        while(sc.hasNext()){
            String str = sc.nextLine();
                for (char c : str.toCharArray()) {
                        set.add(c);
                }
            
            for (char s : set) {
            int x = (int)s-97;
            arrayChars[x]++;

            if(arrayChars[x] >= n){
                count++;
            }
            }
            set.clear();
        }
        System.out.println(count);
        
    }
}
