package interviewStrings;

import java.util.HashMap;

public class MissingElementArrays {
	
	static int  flag=0;

	public static void main(String[] args) {
		
		int a[]={1,3,5,6,8};
		int b[]={1,5,6,8};
		
		MissingElementArrays obj=new MissingElementArrays();
		obj.findMissing(a,b);
		
		if(flag==0)
			System.out.println("No missing number");
		// TODO Auto-generated method stub

	}

	private static void findMissing(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int len1=a.length;
		int len2=b.length;
		
		HashMap <Integer,Integer> map=new HashMap<Integer,Integer>();
		
		if(len1<len2)
		{
			for(int i=0;i<len1;i++)
			{				
				map.put(a[i], 1);
			}
			
			for(int i=0;i<len2;i++)
			{	
				if(map.containsKey(b[i]))
				{
					int val=map.get(b[i]) +1;
					map.put(b[i], val);
				}
				
				if(!map.containsKey(b[i]))
				{
					flag=1;
					System.out.println("Missing number is :- " + b[i]);
				}
			}
		}
		
		else
		{
			for(int i=0;i<len2;i++)
			{				
				map.put(b[i], 1);
			}
			
			for(int i=0;i<len1;i++)
			{	
				if(map.containsKey(a[i]))
				{
					int val=map.get(a[i]) +1;
					map.put(a[i], val);
				}
				
				if(!map.containsKey(a[i]))
				{
					System.out.println("Missing number is :- " + a[i]);
				}
			}
		}
		
	}

}
