/*
 * a-sti.ro
 */
package multithreading;
/**
 *
 * @author gheorgheaurelpacurar
 */
public class JoinPlease {
    public static void main(String args[]) throws InterruptedException {
        try{
            System.out.println("Create SleepMessages thread");
            SleepingThread t = new SleepingThread();
            t.start();
            //Wait 4x4 seconds
            t.join();
            //Print a message after join
            System.out.println("We did wait to have all texts printed by SleepMessages Thread");
        }
        catch (InterruptedException e) {
             //metoda sleep este intreruptibila.
            System.out.println("I was interrupted");
        }
    }
}
