class Queue{
    int arr[];
    int size;
    int rear = -1;

    Queue(int n){
        arr = new int[n];
        this.size = n;
    }

    boolean isEmpty(){
        return rear == -1;
    }

    //Enqueue Method
    void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    //Dequeue
    int remove(){

        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];

        for(int i = 0;i<rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    //peek Method is implemented here 
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return rear;
        }
        return arr[0];
    }
}

public class Queue_Array{
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        
        queue.add(4);
        queue.add(6);
        queue.add(7);
        System.out.println("Peek of Queue is : "+queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.remove();
    }
}