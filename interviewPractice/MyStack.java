package interviewPractice;

public class MyStack {
	static int [] arr;
	int top;
	int size;
	public MyStack(int s){
		top =-1;
		size= s;
		arr =new int [size];
	}
	public static void main(String[] args){
		MyStack stk = new MyStack(10);
		if(!stk.isFull()){
		 stk.push(2);
		 stk.push(13);
		 stk.push(20);
		}
		while(!stk.isEmpty()){
			int rem=stk.pop();
			System.out.println(rem);
		}
//		for(int k=0; k<arr.length-1;k++)
	//		System.out.println(arr[k] + "");
	}
	public void push(int val){
		arr[++top]=val;
	}
	public int pop(){
		return arr[top--];
	}
	public boolean isEmpty(){
		return (top ==-1);
	}
	public boolean isFull(){
		return (top== size-1);
	}
}
