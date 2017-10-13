package interviewDataStructures;

import java.util.*;
import java.io.*;
public class TreeSolution{
	public static void main(String args[]) throws IOException{
		TreeSolution obj = new TreeSolution();
		obj.findChar();
	}
	public void findChar() throws IOException {
		//File file = new File("input.txt");
		//BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line = "yellow";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		//while( (line=buffer.readLine()) != null){
			for(int i=0; i<line.length(); i++){
				char ch = line.charAt(i);
				if( ! map.containsKey(ch)){
					map.put(ch, 1);
				} else {
					map.put(ch, map.get(ch) +1);
				}
				
			}
			for(Character ch : map.keySet()){
				System.out.println( ch + "->" + map.get(ch));
			}
		
		//}
	}
}
	