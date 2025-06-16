package data_structure.pairImpl;

public class PairImpl<K,V> {
    private final K key;
    private final V value;

    public PairImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

}
