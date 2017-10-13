package interviewPractice;

public class DynamicFib {
	public static void main(String[] args) {
		System.out.println(fibonacci(5));
	}
	public static int fibonacci(int i){
		int[] fib = new int[10];
		if( i == 0 )
			return 0;
		if(i == 1)
			return 1;
		if(fib[i] != 0)
			return fib[i]; //return cached result
		fib[i] = fibonacci(i-1) + fibonacci(i-2); //cache result
		return fib[i];
	}
}
