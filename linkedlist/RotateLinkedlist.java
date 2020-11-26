import java.util.*;

class RotateLinkedlist {

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

    void rotate()
    {
        Node temp = head;
        Node curr = head;
        /*Transverse list till temp reach to last second element of list */
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        /*Now last node become the head of list */
        head = temp.next;
        /*Now link the previous head of list to current head by next pointer */
        head.next = curr;
        temp.next = null;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        RotateLinkedlist l = new RotateLinkedlist();
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

        l.rotate();

        System.out.println("Linkedlist after rotation is : ");
        l.printList();

        sc.close();

    }
    
}
