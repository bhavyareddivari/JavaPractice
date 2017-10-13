package interviewDataStructures;

public class BinarySearch {
	static int a[] = {1,2,3,4,5,6};
	
	public static void main(String[] args){
		//System.out.println("hello");
		myMethod();
	}
	
	public static void myMethod(){
		int search = 50;
		int flag=0;
		int f=0, l=a.length-1;
		int mid = (f+l)/2;
		while(f<=l){
			if ( a[mid] < search )
		        f = mid + 1;    
		      else if ( a[mid] == search ) 
		      {
		        //System.out.println("found");
		        flag=1;
		        break;
		      }
		      else
		         l = mid - 1;
			mid=(f+l)/2;
		}
		if(flag==1)
			System.out.println("found");
		else
			System.out.println("not found");
		
	}

}
