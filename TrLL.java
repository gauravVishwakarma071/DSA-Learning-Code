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
        
        //Insertion operations in Linnked list
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
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        //Insert at given position
        public void addAtPosition(int data, int pos){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            if(pos==0){
                newNode.next = head;
                head = newNode;
                return;
            }

            Node temp = head;
            for (int i = 0; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if(temp==null) return;
            newNode.next = temp.next;
            temp.next = newNode;
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


        //Deletion operations in Linked List

        //Deletion At Begning
        public void delFirst(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            head = head.next;
        }

        //Deletion at last node
        public void delLast(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        //Deletion at any specific location
        public void delAtPos(int pos){
            if(head==null){
                System.out.println("List is empty");
                return;
            }

            if(pos==0){
                head = head.next;
                return;
            }

            Node temp = head;
            for (int i = 1; i < pos-1 && temp!=null; i++) {
                temp = temp.next;
            }

            if(temp==null || temp.next == null){
                System.out.println("Invailid position");
                return;
            }
            temp.next = temp.next.next;
        }

        //Searching in LinkedList
        void search(int data){
            Node temp = head;
            int count = 0;
            while(temp.data!=data){
                temp = temp.next;
                count++;
            }
            if(temp.data==data){
                System.out.println(data+" is at Node - "+count);
            }
            else{
                System.out.println(data +" is not in List");
            }                            
        }
        
        //print
        void printList(){ 
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
        
        list.addLast(5);
        list.addFirst(1);
        list.addAtPosition(6, 3);

        list.addLast(45);
        list.setAfter(23, 4);
        list.addAtPosition(7, 4);
        list.delFirst();
        list.delAtPos(0);
        list.addAtPosition(10, 0);
        list.delLast();
        list.printList();
        list.search(23);

    }
}