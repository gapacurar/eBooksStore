/*
 * a-sti.ro
 */
package multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gheorgheaurelpacurar
 */
public class Adunare extends Thread{
    // Create two named pointers to keep along the thread the counter and file writer
    Counter c;
    FileWriter fw;
    CounterDouble cd;
    /**
     Constructor 
     * @param fw file writer
     * @param c Counter
     */
    public Adunare(FileWriter fw, Counter c) {
        this.fw = fw;
        this.c = c;
        cd = null;
    }
    /**
     Constructor 
     * @param fw file writer
     * @param cd CounterDouble
     */
    public Adunare(FileWriter fw, CounterDouble cd) {
        this.fw = fw;
        this.cd = cd;
        c = null;
    }
    
    
    public Counter getC() {
        return c;
    }

    public void setC(Counter c) {
        this.c = c;
    }
    
    /**
     *
     * @param counter
     */
    public Adunare(Counter counter){
        c = counter;
    }
    
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            if(null != c)
                c.increment();
            if(null != cd)
                cd.increment();
            writeCounterInFile(i, "/Users/gheorgheaurelpacurar/Desktop/javaprocess/MultithreadingFile.txt");
        }
    }
    
    synchronized private void writeCounterInFile(int count, String filePath){

        try {
            if(null != c)
                fw.append(" ADUNARE - La citirea "+ count + " contorul are valoarea:" + c.value() + "\n");
            if(null != cd)
                fw.append(" ADUNARE - La citirea "+ count + " contorul double are valoarea:" + cd.value() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Adunare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
