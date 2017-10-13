package interviewPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class Missing {
	
	static ArrayList<Integer> ap= new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String numbers[]=str.split(" ");
		for(String s :numbers){
			ap.add(Integer.parseInt(s));
		}
		int first=ap.get(0);
		int last=ap.get(ap.size()-1);
		int cd=(last-first)/ap.size();
		for(int i=first; i<=last;i=i+cd){
			if(!ap.contains(i)){
				System.out.println(i);
			}
		}
	}
}
