package interviewStrings;
/*
 * O(1)
 * O(N)
 * O(N^2)
 * O(LOG N)
 * O(N LOG N)
 * 
 */



public class BigONotation {
	
	//O(1)   -----it takes same amount of time to execute regardless the data
	int arr[];
	int i=0;
	public void addItem(int item){
		arr[i++]= item;
	}
	
	//O(N) ---look(go through) each item in array
	public void linearsearch(int val){
		boolean valInArray = false;
		String indexesWithValue="";
		for(int i=0; i<arr.length;i++){
			
		}
	}
	
	//O(N^2) -- time to complete will be propotional to square of the number of elements(bubble sort)-Nested iterations
	
	public void bubblesort(){
		for(int i=0;i<arr.length;i++){     //O(N)
			for(int j=0; j<arr.length;i++){   //O(N)
				if(arr[i]>arr[j]){
					//swap
				}
			}
		}
	}
	
	//O(log N) --time is decreased each time 50% (binary search)
	
	public void binarysearch(){
		int a[] = {1,3,5,2,6};
		int f =0, l=a.length-1;
		int mid= f+l/2;
		int val=2;
		while(f<=l){
			if(val<a[mid])
				l=mid-1;
			else if( val>a[mid])
				f=mid+1;
			else
				System.out.println("found");
			mid=f+l/2;
		}
	}
	
	//O(N log N)  --quick sort(values are compared once)
	//comparisons = log n ! = log(n) + log(n-1) +log(n-2)+ .....+ log 1
	//                      = n log n
	
	public void quicksort(int left, int right){
		if(right-left <0){
			return ;
		}
		else {
			int pivot = arr[right];
			int pivotLocation = partition(left, right, pivot);
			quicksort(left, pivotLocation-1);
			quicksort(pivotLocation+1, right);
		}
	}
	public int partition(int left, int right, int pivot){
		int leftPointer = left -1;
		int rightPointer = right;
		while(true){
		}
	}
	
}
