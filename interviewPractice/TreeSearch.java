package interviewPractice;

import java.util.ArrayList;
import java.util.List;

//binary tree
public class TreeSearch {
	public static Node root;
	List<String> nodes = new ArrayList<>();
	public static void setRoot(Node root) {
		TreeSearch.root = root;
	}
	public static Node getRoot() {
		return root;
	}
	public static void main(String[] args) {
		int[] arr ={1,5,3,9,6,2};
		for(int i=0; i<arr.length; i++){
			populate(arr[i]);
		}
		inOrder(root);
	}
	public static void populate(int val){
		Node node = new Node(val);
		if( root == null)
			root = node;
		else
			insert(root,node);
	}
	public static int insert(Node root, Node node){
		
		if(node.val < root.val){
			if(root.left == null){
				root.left = node;
				return node.val;
			}
			else
				insert(root.left, node);
		}
		else{
			if(root.right == null){
				root.right = node;
				return node.val;
			}
			else
				insert(root.right, node);
		}
	return node.val;
	}
	public static void inOrder(Node root) {  
		  if(root !=  null) {  
		   inOrder(root.left);  
		   //Visit the node by Printing the node data    
		   System.out.print(root.val+" ");  
		   inOrder(root.right);  
		  }  
	}  
}



