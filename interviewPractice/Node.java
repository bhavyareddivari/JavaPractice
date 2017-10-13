package interviewPractice;

public class Node {
	Node left;
	Node right;
	int val;
	
	public Node(int val){
		this.val = val;
	}
	public int getValue(){
		return val;
	}
	public void setValue(int val){
		this.val = val;
	}
}
