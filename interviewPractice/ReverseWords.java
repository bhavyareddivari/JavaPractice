package interviewPractice;

public class ReverseWords {
	public static void main(String[] args){
		String str = "Hello this is bhavi";
		StringBuilder sb = new StringBuilder();
		String[] words = str.split(" ");
		for(int i=words.length-1 ; i>=0; i--){
			sb.append(words[i]);
			sb.append(" ");
		}
	}
}