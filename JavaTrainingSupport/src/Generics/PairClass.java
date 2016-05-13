/*
 * copyright a-sti.ro
 */
package Generics;

/**
 *
 * @author gheorgheaurelpacurar
 * @param <K> generic type key
 * @param <V> generic type value
 */
public class PairClass <K, V>{
    private K key;
    private V value;
    // explicit constructor
    public PairClass(K key, V value) {
        this.key = key;
        this.value = value;
    }
    // set-ers and get-ers
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}
