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
    }
        //Insertion at begning position
        public void addFirst(int data){
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
        public void addAtPosition(int data, int pos){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }

            Node currNode = head;
            for (int i = 0; i < pos - 1 && currNode != null; i++) {
                currNode = currNode.next;
            }
            if(currNode==null) return;
            newNode.next = currNode.next;
            currNode.next = newNode;
        }


        //Set value after a speacific value
        public void setAfter(int data, int val){
            Node newNode = new Node(data);

            if(head==null){
                head = newNode;
                return;
            }

            Node temp = head;
            while(temp!=null){

                if(temp.data==val){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
            }

        }

        //print
        public void printList(){
        if(head==null){
            System.out.print("List is empty");
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        
        System.out.print("End");
        }
    

    public static void main(String args[]){
        
        TrLL list = new TrLL();

        list.addFirst(3);
        list.addFirst(4);
        
        list.addEnd(5);
        list.addFirst(1);
        list.addAtPosition(6, 3);

        list.addEnd(45);
        list.setAfter(23, 4);
        list.addAtPosition(7, 4);
        list.printList();

    }
}