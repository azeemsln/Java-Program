import java.util.*;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

        // Implementation of the insertion of a node at the end.

        public void insertionAtEnd(int newData) {
            Node newNode = new Node(newData);

            // LinkedList is empty or not
            if (head == null) {
                head = newNode;
                return;
            }

            // linkedList is not empty
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return;


        }

        public void insertionAtBegin(int newData){
            Node newNode=new Node(newData);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;            

        }

        public void insertionAtPosition(int pos,int newData){
            Node newNode=new Node(newData);
            try {
                if(pos==1){
                    insertionAtBegin(newData);
                }
                int i=1;
                Node temp=head;
                while(i<pos-1){
                    temp=temp.next;
                    i++;
                }
                newNode.next=temp.next;
                temp.next=newNode;
                // temp=newNode;
            } catch (Exception e) {
                System.out.println("Enter a Valid Position");
            }
            

        }

        public void delitionAtPosition(int pos){
            if(head==null){
                return;
            }
            Node temp=head;
            if(pos==0){
                head=temp.next;
            }
            int i=1;

            while(i<pos-1){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;


        }

        void reverseLL(){
            Node curr=head,prev=null,next=null;
            while(curr.next!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            curr.next=prev;
            head=curr;

        }
    
        // Implementation of the printing linkedList.
        public void displayLL() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
         void middeOfLL(){
            // if(head==null){
            //     System.out.println("List is empyt");
            // }
            Node slow=head;
            Node fast =head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println(slow.data);
        }


        // floyd Cycle detection algorithm....

        public void detectLoop(){
            Node slow=head;
            Node fast=head;
            int flag=0;
            while(slow!=null && fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    flag=1;
                    break;
                }
                if(flag==0){
                    System.out.println("No loop detected");
                }
                else{
                    System.out.println("Loop detected");
                }
            }

        }

        public static void main(String[] args) {
            LinkedList list =new LinkedList();
            list.insertionAtEnd(10);
            list.insertionAtEnd(133);
            list.insertionAtBegin(20);
            list.insertionAtBegin(120);
            list.insertionAtBegin(240);
            list.insertionAtPosition(5, 150);
            list.delitionAtPosition(4);
            list.displayLL();
            list.reverseLL();
            list.displayLL();
            list.middeOfLL();

            
        }
    
}
