/*
 * a-sti.ro
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author gheorgheaurelpacurar
 */
public class MultithreadingSleepAndInterrupt {
    public static void main(String[] args){
        // create two diferent SleepingThread, start them and interrupt one of them
        SleepingThread st1 = new SleepingThread();
        SleepingThread st2 = new SleepingThread();
        st1.start();
        st2.start();
        // current thread will sleep for 1.5 seconds
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(MultithreadingSleepAndInterrupt.class.getName()).log(Level.SEVERE, null, ex);
        }
        // before to interrupt st1
        st1.interrupt();
    }
}
