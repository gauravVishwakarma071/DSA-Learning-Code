class Stack{

    Node head;

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    boolean isStackEmpty(){
        return head==null;
    } 

    void push(int data){
        Node newNode = new Node(data);

        if(isStackEmpty()){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    int pop(){
        if(isStackEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    
    int peek(){
        if(isStackEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return head.data;
    }
}

public class StackClass{
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(5);
        stack.push(3);
        stack.push(9);
        while(!stack.isStackEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        
    }
}