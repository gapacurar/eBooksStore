/*
 * Saleable Interface.
 */
package javatraining;

/**
 *
 * @author gheorgheaurelpacurar
 */
public interface Saleable {
    /**
     @const SALEABLE confirm that this item is saleable
     */
    public static final boolean SALEABLE = true;
    
    /**
     * Method returns the value of item that implements the saleable interface.
     * Class that implements the interface should implement this method.
     @return method returns price for sale
     */
    public int getSalePrice();
}
