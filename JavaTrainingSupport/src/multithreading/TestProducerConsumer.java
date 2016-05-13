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
public class TestProducerConsumer {
    static FileWriter fw;
    static FileWriter fwpc;
    static WorkingBuffer wb;

    
    public static void main(String[] args){

        // create a new counter
        wb = new WorkingBuffer();
        // create access to files on disk
        try {
            fw = new FileWriter("/Users/gheorgheaurelpacurar/Desktop/javaprocess/MultithreadingFile.txt");
            fw.append("TEST PRODUCER CONSUMER THREAD ------------------------------------------------------\n");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }        
        try {
            fwpc = new FileWriter("/Users/gheorgheaurelpacurar/Desktop/javaprocess/ProducerConsumer.txt");
            fwpc.append("TEST PRODUCER CONSUMER THREAD ------------------------------------------------------\n");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }        // create two paralel threads to use a working buffer
        Producer p = new Producer(wb, fwpc);
        p.start();
        Consumer c = new Consumer(wb, fwpc);
        c.start();
        // Print value of contror in the third paralel thread
        for(int i=0;i<500;i++){
            System.out.println("La citirea "+ i + " working buffer are valoarea:" + wb.value());
            writeCounterInFile(i, "/Users/gheorgheaurelpacurar/Desktop/javaprocess/MultithreadingFile.txt");
        }
    }
    
    synchronized private static void writeCounterInFile(int count, String filePath){
        try {
            fw.append("TEST1 CONSUMER PRODUCER - La citirea "+ count + " working buffer are valoarea:" + wb.value() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
