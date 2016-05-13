/*
 * a-sti.ro
 */
package multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Consumer extends Thread{
    FileWriter fw;
    /** reading buffer*/
    WorkingBuffer rb;
        
    @Override
    public void run(){
        for (int i=0;i<500;i++){
            try {
                String value = rb.take();
                fw.append("CONSUMER downloaded in step "+i+" value "+value+"\n");
            } catch (IOException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     *
     * @param rb write buffer
     * @param fw
     */
    public Consumer(WorkingBuffer rb, FileWriter fw){
        this.rb = rb;
        this.fw = fw;
    }
}
