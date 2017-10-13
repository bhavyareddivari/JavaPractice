package interviewDataStructures;
import java.util.HashMap;
import java.util.ArrayList;

//print unique cars in sorted order
public class DuplicateElements {
	public static void main(String[] args){
		int arr[] = {1,5,5,7,8,9,3,1};
		HashMap<Integer, Boolean> hash = new HashMap<>();
		for(int i=0; i<arr.length;i++){
			if(!hash.containsKey(arr[i])){
				hash.put(arr[i], true);
				//System.out.println(arr[i]);

			}
			else{
				hash.put(arr[i], false);
				//System.out.println(arr[i]);

			}				
		
		}
		for( int a :hash.keySet()){
			if(hash.get(a))
				System.out.println(a);
		}
	}
}
