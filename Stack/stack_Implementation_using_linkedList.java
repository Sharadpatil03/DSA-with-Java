import java.util.*;

public class Main {
 public static class Node{
    int data;
    Node next;
    
    Node(int data){
      this.data=data;
      next=null;
    }
  }
  
   public static class Stack{
     static Node head;
    
    //check is stack is empty or not
    public static boolean isEmpty(){
      return head==null;
    }
    
    public static void push(int data){
      Node newNode = new Node(data);
      if(isEmpty()){
        //add the node as head
        
        head=newNode;
        return;
        
      }
      
      //stack is not empty then add the new node and make as head(to follow LIFO)
      
      newNode.next=head;
      head=newNode;
    }
  
  
  
   public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
  
 // Peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
  
   }
  
 
    public static void main(String[] args) {
      
    //Stack implementation using Linked linkedList 
     Stack s =new Stack();
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
     
     while(!s.isEmpty()){
       System.out.println(s.peek());
       s.pop();
     }
      
     
      
  }
}
