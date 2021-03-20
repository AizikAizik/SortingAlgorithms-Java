import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class LinkedList {
    Node head; // head of the linked list
    Node tail; // tail of the linked list
    List<Integer> linkedListArray = new ArrayList<>();

    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "\n\thead = " + head.value +
                "\n\ttail = " + tail.value +
                "\n\tlinkedListArray: " + linkedListArray +
                "\n}";
    }

    // insert a node at the begining of a linked list
    public void InsertAtBeginning(int key){
        Node temp = new Node(key);
        if(head == null){
            head = temp;
            tail = temp;
            linkedListArray.add(head.value);
        }else{
            temp.next = head;
            head = temp;
            linkedListArray.add(0, head.value);
        }
    }

    // insert at the end  of a linked list
    public void InsertAtEnd(int key){
        Node temp = new Node(key);
        if(head == null){
            head = temp;
            tail = temp;
            linkedListArray.add(head.value);
        }else{
            Node temp2 = head;
            while(temp2.next != null){
                temp2 = temp2.next;
            }
            temp2.next = temp;
            tail = temp;
            linkedListArray.add(tail.value);
        }
    }

    // delete head of the LinkedList
    public void DeleteFromBeginning(){
        if(head == null){
            System.err.println("LinkedList is already empty");
            return;
        }

        if(head.next == null){
            head = null;
            tail = null;
            linkedListArray.remove(0);
        }else {
            Node oldHead = head;
            Node newHead = head.next;
            head = newHead;
            linkedListArray.remove(0);
            System.out.println("Node deleted successfully from the beginning");
        }

    }

    // delete tail of the LinkedList
    public void DeleteFromEnd(){
        if(head == null){
            System.err.println("LinkedList is already empty");
            return;
        }

        if(head.next == null){
            head = null;
            tail = null;
            linkedListArray.remove(0);
        }else {
            Node temp2 = head;
            while(temp2.next != null){
                temp2 = temp2.next;
                if(temp2.next.next == null)
                    break;
            }
            tail = temp2;
            tail.next = null;
            linkedListArray.remove(linkedListArray.size() - 1);
            System.out.println("Node deleted successfully from the end");
        }

    }

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.InsertAtBeginning(5);
        l.InsertAtBeginning(2);
        l.InsertAtBeginning(7);
        l.InsertAtEnd(0);

        System.out.println(l.toString());

        System.out.println("==================================");
        System.out.println("LinkedList after deletion from front");
        l.DeleteFromBeginning();
        System.out.println(l.toString());

        System.out.println("==================================");
        System.out.println("LinkedList after deletion from end");
        l.DeleteFromEnd();
        System.out.println(l.toString());

    }

}
