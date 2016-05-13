/*
 * a-sti.ro
*/
package multithreading;

/**
 * @author gheorgheaurelpacurar
 */
public class Counter {
    //var. comuna ce va fi accesata de mai multe threaduri
    private int c;

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
    public int value() {
        return c;
    }
}
