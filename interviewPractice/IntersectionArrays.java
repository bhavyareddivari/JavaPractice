package interviewPractice;

import java.util.ArrayList;

public class IntersectionArrays {
	static int arr1[] = {7, 1, 5, 2, 3, 6};
	static int arr2[] = {3, 8, 6, 20, 7};
	static ArrayList <Integer> union = new ArrayList<>();
	
	public static void main(String[] args) {
		method();
	}
	
	public static void method(){
		//System.out.println("HII");
		for(int i=0; i<arr1.length; i++){
			union.add(arr1[i]);
			System.out.print(union.get(i) + " ");
		}
		for(int j=0;j<arr2.length; j++){
				int m = union.size();
				int flag=0;
			for(int k=0;k<union.size();k++){
				if(arr2[j]==union.get(k))
					continue;
				else{
					flag=1;
				}	
			}
			if(flag ==1){
				union.add(arr2[j]);
				System.out.print(arr2[j] + " ");
				m++;
			}
				
		}
		//for(int i=0; i<union.size();i++)
			//System.out.print(union.get(i) + " ");
	
	}
}
