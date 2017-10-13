package interviewDataStructures;

import java.util.HashMap;

public class UniqueCharacters {
	
	public static String concatUnique(String str1, String str2){
		HashMap<Character, Integer> uniqueMap = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		String concatString = str1.concat(str2);
		for(int i=0; i<concatString.length(); i++){
			char ch= concatString.charAt(i);
			if(!uniqueMap.containsKey(ch)){
				uniqueMap.put(ch, 1);
			}
			else{
				uniqueMap.put(ch, uniqueMap.get(ch)+1);
			}
		}
		for(int i=0; i<concatString.length();i++){
			char ch = concatString.charAt(i);
			if(uniqueMap.get(ch)==1){
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String args[]){
		String result = concatUnique("bhavya", "Ram");
		System.out.println(result);
	}
	
}
