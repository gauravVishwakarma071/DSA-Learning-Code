class LL{
    Node head;

    //Node structure
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //addfirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //AddLast
    public void addlast(int data){
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
        LL list = new LL();

        list.addFirst(3);
        list.addFirst(4);
        
        list.addlast(5);
        list.addFirst(1);

        list.printList();
    }
}