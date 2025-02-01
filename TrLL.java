public class TrLL{

    Node head;
    //Node Structure
    class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        //Insertion at begning position
        public void addFrist(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //Insertion at End of Linked List.
        public void addEnd(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        //Insert at given position
        public void addAtPosition(int data,int pos){
            
        }
    }


    public static void main(String args[]){


    }
}