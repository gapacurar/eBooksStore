/*
 * a-sti.ro
 */
package multithreading;
/**
 *
 * @author gheorgheaurelpacurar
 */
public class SleepingThread extends Thread{
    
    @Override
    public void run() {
        String importantInfo[] = {
            "We can put a thread on pause,",
            " using static sleep method,",
            " of class Thread.",
            " But is this a perfect and precise way to do that?"
        };
        for (String importantInfo1 : importantInfo) {
            try {
            //Pause 4 secunde
            Thread.sleep(4000);
            //Print next String from initial array
            System.out.println(importantInfo1);
            System.out.println("I am SleepingThread with thread ID: " + this.getId() + " and I am running :)");
            }
            catch (InterruptedException e) {
            //metoda sleep este intreruptibila.
            System.out.println("I am SleepingThread with thread ID: " + this.getId() + " and I was interrupted :(( ");
       		return;
            }
            // If the interruption was not catched in sleep we can catch it here and throw it...Where?
            if (Thread.interrupted()) {
            }
        }
    }
}
