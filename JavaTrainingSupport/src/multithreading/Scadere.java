/*
 * a-sti.ro
 */
package multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Scadere extends Thread{

    // Create two named pointers to keep along the thread the counter and file writer
    FileWriter fw;
    Counter c;
    CounterDouble cd;
    
    // Constructor loads the pointers with the addresses of instances 
    public Scadere(FileWriter fw, Counter c) {
        this.fw = fw;
        this.c = c;
        cd = null;
    }
    // Constructor loads the pointers with the addresses of instances 
    public Scadere(FileWriter fw, CounterDouble cd) {
        this.fw = fw;
        this.cd = cd;
        c=null;
    }
    public Counter getC() {
        return c;
    }

    public void setC(Counter c) {
        this.c = c;
    }
    
    public Scadere(Counter c) {
        this.c = c;
    }
    
    
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            if(null != c)
                c.decrement();
            if(null != cd)
                cd.decrement();
            writeCounterInFile(i, "/Users/gheorgheaurelpacurar/Desktop/javaprocess/MultithreadingFile.txt");
        }    
    }
    
    synchronized private void writeCounterInFile(int count, String filePath){

        try {
            if(null != c)
                fw.append(" SCADERE - La citirea "+ count + " contorul are valoarea:" + c.value() + "\n");
            if(null != cd)
                fw.append(" SCADERE - La citirea "+ count + " contorul double are valoarea:" + cd.value() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Scadere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
