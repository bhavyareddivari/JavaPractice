package interviewPractice;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]={5, 45,12,8,1};
		int value,pos;
		int MAX=arr.length;
		for(int i=1; i< MAX;i++){
			value=arr[i];
			pos=i;
			while(pos >0 && arr[pos-1] > value){
				arr[pos]=arr[pos-1];
				pos--;
			}
			if(pos!=i)
				arr[pos]=value;
			
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
}
