import java.util.*;
class ReverseLinkedlist {

    Node head;

    class Node{

        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 

    }

    void push(int d)
    {
        Node node = new Node(d);
        node.next = head;
        head = node;
    }

    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    void reverse()
    {
        Node curr = head;
        Node prev = null;
        Node temp = null;
        /*Tranverse the list till end by interchanging previous and next nodes of current node */
        while(curr != null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        head = prev;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ReverseLinkedlist l = new ReverseLinkedlist();
        int m=0;

        do{

            System.out.println("Enter the element of Linkedlist : ");
            int k = sc.nextInt();
            l.push(k);

            System.out.println("If you don't want to continue enter 1 else enter 0 :");
            m = sc.nextInt();

        }while(m != 1);

        System.out.println("Original Linkedlist is : ");
        l.printList();

        l.reverse();

        System.out.println("Reversed Linkedlist is : ");
        l.printList();

        sc.close();


    }
    
}
