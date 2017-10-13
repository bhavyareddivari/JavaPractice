package interviewPractice;
import java.util.Scanner;

public class Ksmallest {	
	public static void main(String[] args){
		int[] arr = {12,3,17,0,9,6,100};
		// quick sort
		System.out.print("enter k:");
		Scanner sc= new Scanner(System.in);
		int k = sc.nextInt();
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("Kth smallest element is "+ arr[k-1]);
		sc.close();
	}
	public static void quicksort(int arr[], int l, int r){
		int index = partition(arr,l,r);
		if(l < index-1)
			quicksort(arr, l, index-1);
		else if(index < r)
			quicksort(arr,index,r);
	}
	public static int partition(int arr[], int l, int r){
		int i=l, j=r;
		int pivot = arr[(i+j)/2];
		int temp;
		while(i<=j){
			while(arr[i]< pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i<=j){
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
				i++;
				j--;
			}
		}
		return i;
	}
}
