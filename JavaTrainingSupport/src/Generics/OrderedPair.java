/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author gheorgheaurelpacurar
 * Package private Interface Pair, an interface that is using two generic types
 * K and V
 */
interface Pair<K, V> {
    public K getKey();
    public V getValue();
}
/**
 @author gheorgheaurelpacurar
 * Class OrderedPair is an ordered list of pairs (key, value)
 * Class 
 * @param <K> generic key type
 * @param <V> generic value type
 */
public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    @Override
    public K getKey()	{ return key; }
    @Override 
    public V getValue() { return value; }
}