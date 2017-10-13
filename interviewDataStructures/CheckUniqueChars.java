package interviewDataStructures;

// check whether given string has unique or not

public class CheckUniqueChars {

	public static void main(String[] args) {
		String str ="bhavyaram";
		System.out.println(isUnique(str));
	}
	public static boolean isUnique(String str){
		if(str.length() > 128)
			return false;
		boolean[] boo = new boolean[256];
		for(int i =0; i<str.length();i++){
			int ch = str.charAt(i);
			if(boo[ch])
				return false;
			boo[ch]=true;
		}
		return true;
	}
}
