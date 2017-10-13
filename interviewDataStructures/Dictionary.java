package interviewDataStructures;
import java.io.*;
import java.util.HashSet;
//find the given word is in dictionary or not
public class Dictionary {
	static HashSet<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException{
		String line = null;
		String input = "act";
		File file = new File("/Users/Bhavya/Documents/javapro/Examples/src/InterviewDataStructures/input.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		while((line = buffer.readLine()) != null){
			set.add(line);
		}
		findWords(input);
	}
	public static void findWords(String str){
		printPerm("", str);
	}
	//passing empty string as current permutation to start with
	public static void printPerm(String perm, String word){
		if(word.isEmpty()){
			if(set.contains(perm + word))
				System.out.println(perm + word);
			
		}else{
			for(int i=0; i< word.length();i++){
				//System.out.print(word.substring(0,i)+ word.substring(i+1, word.length()) + " ");
				printPerm(perm + word.charAt(i) , word.substring(0,i)+ word.substring(i+1, word.length()));
			}
		}
	}
}
