package interviewPractice;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]={5, 45,12,8,1};
		int min, temp;
		int MAX=arr.length;
		for(int i=0; i< MAX-1;i++){
			min = i;
			for(int j=i+1; j<MAX ;j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			if(min !=i){
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
}