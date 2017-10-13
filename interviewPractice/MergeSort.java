package interviewPractice;

public class MergeSort {
	static int[] a={5,45,12,8,1};
	static int[] b = new int[5];
	public static void main(String[] args) {
		sort(0, a.length-1);
		for(int i=0;i<a.length;i++)
		 System.out.print(a[i]+" ");
	}
	
	public static void sort(int low , int high){
		int mid=0;
		if(low< high){
			mid=(low+high)/2;
			sort(low,mid);
			sort(mid+1, high);
			merging(low, mid, high);
		}else
			return;		
	}
	
	public static void merging(int low, int mid, int high){
		 int l1, l2, i;
		   for(l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
		      if(a[l1] <= a[l2])
		         b[i] = a[l1++];
		      else
		         b[i] = a[l2++];
		   }
		   while(l1 <= mid)    
		      b[i++] = a[l1++];

		   while(l2 <= high)   
		      b[i++] = a[l2++];

		   for(i = low; i <= high; i++)
		      a[i] = b[i];
	}
}