package structures;

public interface iHashTable<K, V> {
    void insert (K key, V value);
    V get(K key);
    void delete(K key);
    int size();
    boolean isEmpty();
}
