class Queue{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    boolean isEmpty(){
        return head==null;
    }

    //Enqueue
    public void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }      
        temp.next = newNode;
    }
    
    //Dequeue
    int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    
    //front
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
}

public class Queue_LL {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        System.out.println(queue.peek()); // Should print 10
        
        queue.remove();
        System.out.println(queue.peek());
    }
}
