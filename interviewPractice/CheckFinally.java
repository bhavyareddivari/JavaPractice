package interviewPractice;

import java.util.StringTokenizer;

public class CheckFinally {
	public static void main(String[] args) {
		String input="bhavya,ram";
		StringTokenizer str = new StringTokenizer(input, ",");
		while(str.hasMoreElements())
			System.out.println(str.nextElement());
		String[] tokens = input.split(",");
		for(String s : tokens)
			System.out.println(s);
		int arr[] ={2,3};
		try{
			for(int i=0;i<arr.length+2;i++)
				System.out.println(arr[i]);
			return;
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		catch(Exception e){
			
		}
		finally{
			System.out.println("in finally");
		}
		
	}
}
