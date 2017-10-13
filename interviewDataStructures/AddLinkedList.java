package interviewDataStructures;
import java.util.LinkedList;

public class AddLinkedList {
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<>();
		//adding elements to ll
		ll.add("2");
		ll.add("7");
		ll.addFirst("5");
		ll.addLast("9");
		ll.add(2,"3");
		System.out.print(ll);
		ll.remove(2);
		ll.removeLast();
		System.out.print(ll);
	}
}
