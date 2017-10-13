package interviewStrings;
import java.util.List;
import java.util.ArrayList;
public class ReverseEachWord {
	public static void main(String[] args){
		String str = "Hello this is bhavi";
		String[] words = str.split(" ");
		String res = "";
		for(String word : words) {
			for(int i =word.length() - 1; i >= 0 ;i--){
				res +=word.charAt(i);
			}
			res += " ";
		}
		System.out.println(res);
	}
}
