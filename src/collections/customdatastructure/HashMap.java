package collections.customdatastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashMap <K , V>{
    private static int arraySize = 10;
    HashNode<K , V> [] array = new HashNode[arraySize];
    public void put(K key , V value){
        HashNode<K , V> node = new HashNode<>(key.hashCode() , key , value);
        int index = key.hashCode() % arraySize;
        if (array[index] == null){
            array[index] = node;
        } else {
            HashNode hashNode = array[index];
            if (hashNode.key.equals(key)){
                hashNode.value = value;
            } else {
                while (hashNode.next != null) {
                    hashNode = hashNode.next;
                    if (hashNode.key.equals(key)) {
                        hashNode.value = value;
                        break;
                    }

                }
                if(!hashNode.key.equals(key)) {
                    hashNode.next = node;
                }
            }
        }
    }

    public V get(K key){
        int index = key.hashCode() % arraySize;
        if(array[index] == null){
            return null;
        } else {
            HashNode<K , V> hashNode = array[index];
            while (!hashNode.key.equals(key)){
                hashNode = hashNode.next;
            }
            return hashNode.value;
        }
    }
}
