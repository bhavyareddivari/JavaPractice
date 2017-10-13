package interviewDataStructures;
import java.util.Scanner;
import java.util.Stack;

public class MatchParanthesis {
	
	public static void main(String[] args){
		System.out.println("enter expression:");
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		boolean result= evaluate(str);
		System.out.println(result);
		sc.close();
	}
	public static boolean evaluate(String str){
		Stack<Character> stack= new Stack<>();
		char ch;
		for(int i=0; i< str.length();i++){
			ch=str.charAt(i);
			if(ch == '(')
				stack.push(ch);
			else if(ch == ')'){
				if(stack.empty()) 
					return false;
				else if(stack.peek() == '(') //look at the top of the stack without removing it
					stack.pop();
				else
					return false;
			}
	   }
		return stack.empty();
	}
}
