package interviewDataStructures;

public class LinkedListImpl {
	public static void main(String args[]){		
		int arr[] = {2,3,4,5,6};
		Node head = null;
		for(int i=0; i<arr.length;i++){
			head = insert( head, arr[i]);
		}
		display(head);
		head = reverse(head);
		display(head);

	}
	public static Node insert(Node head, int val){
		Node current = head;
		if(head == null){
			return new Node(val);
		}
		while(current.next!=null){
			current = current.next;
		}
		current.next = new Node(val);
		return head;
	}
	public static void display(Node head){
		 Node temp = head;  
		  while (temp != null) {  
		   System.out.printf("%d ", temp.val);  
		   temp = temp.next;  
		  }  
	}
	public static Node reverse(Node head){
		if(head == null || head.next ==null)
			return head;
		Node curr = head;
		Node prevNode = null;
		Node nextNode = null;
		while(curr!=null){
			nextNode = curr.next;
			curr.next = prevNode;
			prevNode =curr;
			curr = nextNode;
		}
		return prevNode;
					
	}
}
class Node{
	int val;
	Node next;
	public Node(int val){
		this.val = val;
		this.next = null;
	}
}