package interviewDataStructures;
import java.util.HashMap;
public class Student {
	int id;
	public Student(int id){
		this.id= id;
	}
	public int getId(){
		return id;
	}
	public static void main(String[] args){
		Student[] students= new Student[3];
		String[] str = {"this","is", "hello","world"};
		students[0]= new Student(1);
		students[1]= new Student(2);
		students[2]= new Student(3);
		//buildMap(students);
		stringConcat(str);
	}
	public static void buildMap(Student[] students){
		HashMap<Integer, Student> map = new HashMap<>();
		for(Student s: students){
			map.put(s.getId(), s);
			System.out.println( map.get(s.getId()));

		}
	}
	public static void stringConcat(String[] words){
		StringBuilder sentence = new StringBuilder();
		for(String word :words)
			sentence.append(word);
		System.out.println(sentence.toString());
	}
}
