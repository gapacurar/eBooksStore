/*
 * Rentable interface
 */
package javatraining;

/**
 *
 * @author gheorgheaurelpacurar
 */
public interface Rentable {
     /**
     @const REC_RENT_PRICE is recommended price to sell
     */
    public static final boolean RENTABLE = true;
    
    /**
     * Method returns the value of item that implements the saleable interface.
     * Class that implements the interface should implement this method.
     @return method returns price for daily rent
     */
    public int getDailyRentPrice();
}
