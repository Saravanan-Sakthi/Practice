package collections.customdatastructure;

public class Node <T1 , T2> {
    T1 key;
    T2 value;
    Node<T1 , T2> prev;
    Node<T1 , T2> next;

    public Node(T1 key, T2 value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "key = " + key +
                " value = " + value ;
    }
}
