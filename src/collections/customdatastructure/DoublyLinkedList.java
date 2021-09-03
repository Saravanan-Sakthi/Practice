package collections.customdatastructure;

public class DoublyLinkedList <T1 , T2> {
    Node head;
    Node tail;

    public void add(T1 key , T2 value){
        Node node = new Node(key , value);
        if (head == null){
            head = node;
            tail = node;
        } else {
            tail.next =node;
            node.prev = tail;
            tail = node;
        }
    }

    public void printALl(){
        Node node = head;
        System.out.println(node);
        while (node.next != null){
            System.out.println(node.next);
            node = node.next;
        }
    }

}
