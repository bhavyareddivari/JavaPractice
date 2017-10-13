package interviewDataStructures;

import java.util.*;
import java.math.*;

public class UniquePairs {

    public static void main(String[] args) {
       HashSet<String> hashSet = new HashSet<>();
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
       
       while(sc.hasNext()){
           String s=sc.nextLine();
           hashSet.add(s);     
           System.out.println(hashSet.size());
       }
        
    }
}
