package collections.customdatastructure;

public class HashNode <K , V>{
    int hash;
    K key;
    V value;
    HashNode<K, V> next;

    public HashNode(int hash, K key, V value) {
        this.hash = hash;
        this.key = key;
        this.value = value;
    }
}
