class DoublyLinkedList{

    public class Node{ //No need to create an object for specifying a Node
        private int data;
        private Node next;
        private Node prev;

        Node(int data){ //Constructor for creating a Node with element inside it
            this.data=data;
            next=null;
            prev=null;
        }

    } //Implementation of a Node in a LinkedList

    private Node head=null;
    private Node tail=null;
    private int count=1; //It tells how many elements are there in the List

    public void InsertAtFront(int elem){

        Node newNode=new Node(elem); //Creating a new Node

        if (head==null){//If the linked list is empty
            head=newNode;
            tail=head;//this is to keep track of the previous element

            count++;
        }

        else{
            tail.next=newNode;
            newNode.prev=tail;
            newNode.next=null;
            tail=newNode;
            
            count++;
        }
    }

    public void InsertAtBack(int elem){
        Node newNode=new Node(elem);

        if (head==null){
            head=newNode;
            tail=head;

            count++;
        }

        else{
            head.prev=newNode;
            newNode.next=head;
            newNode.prev=null;
            head=newNode;

            count++;
        }
    }

    public void InsertAny(int elem,int pos){//Determines at any position

        Node newNode=new Node(elem);

        Node left=null;
        Node right=null;

        if (head==null){
            head=newNode;
            tail=head;

            count++;
        }

        if (pos==1){
            InsertAtFront(elem);
        }

        else if (pos==count){
            InsertAtBack(elem);
        }

        else if (pos<=0){
            System.out.println("Invalid Position");
        }

        else{
            int i=1;
            right=head;

            while(i!=pos-1){
                right=right.next;
                left=right.prev;

                i++;
            } //Finding the Position and Noting the next and prev address 
            //Of the position we want to find 

            newNode.next=right;
            newNode.prev=left;

            //After the while loop has ended the next & prev address is assossicated with 
            //newNode

            left.next=newNode;
            right.prev=newNode;

            count++;

            //Linking the newNode with left node and right node respectively
        }
    }



    public void Display(){

        if (head==null){
            System.out.println("List is empty");
            System.out.println();
        }

        else{
            Node ptr;
            ptr=head;

            while(ptr.next!=null){
                System.out.print(ptr.data+"->");
                ptr=ptr.next;
            }
            System.out.println(ptr.data);
        }
    }
}

class Demo{
    public static void main(String[] args) {
        DoublyLinkedList DLL=new DoublyLinkedList();

        DLL.InsertAtFront(1);
        DLL.InsertAtFront(2);
        DLL.InsertAtFront(3);
        DLL.InsertAtFront(4);
        DLL.InsertAtFront(6);
        DLL.Display();

        DLL.InsertAny(5, 3);
        DLL.Display();
        
    }
}



