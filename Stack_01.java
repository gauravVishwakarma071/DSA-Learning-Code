public class Stack_01{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    static class Stack{
        public static Node head;
        public static boolean isStackEmpty(){
            return head==null;
        }

        //Push Method
        void push(int data){
            Node newNode = new Node(data);
            if(isStackEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //Pop method
        int pop(){
            if(isStackEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //Peek method
        int peek(){
            if(isStackEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(9);
        stack.push(2);

        while(!Stack.isStackEmpty()){
            System.out.println(stack.pop());
        }
       System.out.println(stack.peek());
    }
}