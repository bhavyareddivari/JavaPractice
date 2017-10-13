package interviewStrings;

public class ReplaceSpaces {
	public static void main(String[] args){
		String str="Mr John Smith    ";
		int length = 13;
		replace(str.toCharArray(),length);
	}
	public static void replace(char[] str, int length){
		int spaces=0;
		for(int i=0; i< length ;i++){
			if(str[i] == '\0')
				spaces++;
		}
		int newLength = length + spaces*2;
		str[newLength]='\0';
		for(int i = length-1; i>=0; i--){
			if(str[i] == '\0'){
				str[newLength -1] ='0';
				str[newLength -2]='2';
				str[newLength-3] ='%';
				newLength = newLength - 3;
			} else{
				str[newLength -1] = str[i];
				newLength= newLength -1;
			}
		}
		System.out.println(str);
	}
}
