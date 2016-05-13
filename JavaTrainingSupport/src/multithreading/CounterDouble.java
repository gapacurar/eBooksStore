/*
 * a-sti.ro
 */
package multithreading;
/**
 * @author gheorgheaurelpacurar
 */
public class CounterDouble {

    //var. comuna ce va fi accesata de mai multe threaduri
    private volatile double c;
    /**
     * Increments the counter
     */
    synchronized public void increment() {
        c++;
    }
    /**
     * Decrements the counter
     */
    synchronized public void decrement() {
        c--;
    }
    /**
     *
     * @return value of counter
     */
    public double value() {
        return c;
    }    
}
