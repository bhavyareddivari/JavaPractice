package interviewPractice;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int temp=0;
		int MAX=arr.length;
		boolean flag= false; //to check if array is already sorted
		for(int i=0; i< MAX-1;i++){
			for(int j=0; j < MAX-1-i; j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag= true;
				}
			}
			if(!flag)
				break;
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
}
