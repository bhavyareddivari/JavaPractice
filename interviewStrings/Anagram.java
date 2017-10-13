package interviewStrings;

import java.util.Arrays;
//check if 2 strings have same letters
public class Anagram {
	public static void main(String[] args) {
		System.out.println(checkAnagram("keep","peek"));
	}
	public static boolean isAnagram(String str1, String str2){
		//if(str.length() == str2.length()) return false;
		char[] s1=str1.replaceAll(" ", "").toLowerCase().toCharArray();
		char[] s2 =str2.replaceAll(" ", "").toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		//System.out.println(s1[0] == s2[0]);
		return (Arrays.equals(s1, s2));		
	}
	public static boolean isAna(String word, String anagram){ 
		if(word.length() != anagram.length()){ 
			return false; 
		} 
		char[] chars = word.toCharArray();
		for(char c : chars){ 
			int index = anagram.indexOf(c);
			if(index != -1){ 
				anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length()); 
			}else{
				return false; 
			}
		}
		return anagram.isEmpty(); 
	}
	public static boolean checkAnagram(String first, String second){ 
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second); 
		for(char ch : characters){ 
			int index = sbSecond.indexOf("" + ch);
			if(index != -1){
				sbSecond.deleteCharAt(index);
			}else{
				return false; 
			}
		}
		return sbSecond.length()==0 ? true : false; 
		}
}

//static boolean isAnagram(String A, String B) {
//	   if (A.length()!=B.length()){
//	       return false;
//	   }
//	   A = new String(A.toLowerCase().toCharArray());
//	   B = new String(B.toLowerCase().toCharArray());
//	   HashMap mapA= new HashMap();
//	   HashMap mapB= new HashMap();
//	   boolean anagram = true;
//	   for (int i = 0; i < A.length(); i++){
//	       if (mapA.get(A.charAt(i)) == null){
//	           mapA.put(A.charAt(i),1);
//	       }
//	       else{
//	           mapA.put(A.charAt(i),1 + (int)mapA.get(A.charAt(i)));
//	       }
//	       if (mapB.get(B.charAt(i)) == null){
//	           mapB.put(B.charAt(i),1);
//	       }
//	       else{
//	           mapB.put(B.charAt(i),1 + (int)mapB.get(B.charAt(i)));
//	       }
//	   }
//	  for (Object key : mapA.keySet()) {
//	        if (mapA.get(key)!=mapB.get(key)){
//	            anagram = false;
//	        }
//	    }
//	return anagram;
//	}



