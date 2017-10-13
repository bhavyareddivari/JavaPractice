package interviewPractice;

public class MyQueue {  
 private static final int capacity = 4;  
 static int arr[] = new int[capacity];  
 int size = 0;  
 static int rear = -1;  
 static int front = 0;  
  
 public static void main(String[] args) {  
	  MyQueue queueDemo = new MyQueue();  
	  queueDemo.delete();  
	  queueDemo.insert(23);  
	  queueDemo.insert(2);  
	  queueDemo.insert(73);  
	  queueDemo.insert(21);  
	  //queueDemo.delete();  
	  //queueDemo.delete();  
	  queueDemo.delete();  
	  queueDemo.delete();  
	  display();
}  
 
 public void insert(int pushedElement) {  
  if (rear < capacity - 1) {  
   rear++;  
   arr[rear] = pushedElement;  
   //System.out.println("Element " + pushedElement  
    // + " is pushed to Queue !");  
   //display();  
  } else {  
   System.out.println("Overflow !");  
  }  
  
 }  
  
 public void delete() {  
  if (rear >= front) {  
   front++;  
   //System.out.println("Pop operation done !");  
   //display();  
  } else {  
   System.out.println("Underflow !");  
  }  
 }  
  
 public static void display() {  
  if (rear >= front) {  
   System.out.println("Elements in Queue : ");  
   for (int i = front; i <= rear; i++) {  
    System.out.println(arr[i]);  
   }  
  }  
 }  
  
 
  
}  