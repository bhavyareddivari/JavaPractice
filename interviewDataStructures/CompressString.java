
//i/p: 455666 o/p: 415263

package interviewDataStructures;
import java.util.HashMap;

public class CompressString {
	public static void main(String[] args) {
		String str= "122333";
		check(str);
	}
	public static void check(String str){
		StringBuilder sb = new StringBuilder();
		//HashMap<Character, Integer>map = new HashMap<>();
		char last = str.charAt(0);
		int count=1;
		for(int i=1; i<str.length();i++){
			if(str.charAt(i) == last){
				count++;
			}
			else{
				sb.append(count);
				sb.append(last);
				last=str.charAt(i);
				count=1;
			}			
        }
		sb.append(count);
		sb.append(last);
        System.out.println(sb.toString());
	}
}
