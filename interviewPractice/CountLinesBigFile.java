package interviewPractice;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
//count lines and words in a a file
public class CountLinesBigFile {
	public static void main(String[] args) {
		int lines =0;
		String line;
		ArrayList<String> arr = new ArrayList<>();
		try{
			File file = new File("/Users/Bhavya/Documents/javapro/Examples/src/InterviewPractice/input.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line=br.readLine()) != null){
            //System.out.println(line);
				String[] str = line.split(" ");
				for (String s: str)
					arr.add(s);
				lines++;
			}
			System.out.println("no.of lines "+ lines +" "+ arr.size());
			br.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
