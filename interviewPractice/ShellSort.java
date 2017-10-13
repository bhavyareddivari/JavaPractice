package interviewPractice;

public class ShellSort {
	public static void main(String[] args) {
		int [] intArray={5, 45,12,8,1};
		int inner, outer;
		   int valueToInsert;
		   int interval = 1;   
		   int elements = intArray.length;;
		   int i = 0;
		   
		   while(interval <= elements/3) {
		      interval = interval*3 +1;                   
		   }

		   while(interval > 0) {
		
		      for(outer = interval; outer < elements; outer++) {
		         valueToInsert = intArray[outer];
		         inner = outer;
					
		         while(inner > interval -1 && intArray[inner - interval] 
		            >= valueToInsert) {
		            intArray[inner] = intArray[inner - interval];
		            inner -=interval;
		         }
		         
		         intArray[inner] = valueToInsert;
		      }
				
		      interval = (interval -1) /3;           
		      i++;
		   }          
		for(int j=0;j<intArray.length;j++)
		System.out.print(intArray[j]+" ");
	}
}