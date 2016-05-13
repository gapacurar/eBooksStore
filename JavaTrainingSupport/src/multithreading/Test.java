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
public class Test {
 
    static FileWriter fw;
    static Counter c;

    
    public static void main(String[] args){
        // create a new counter
        c = new Counter();
        // write a message to announce main thread - Test
        try {
            fw = new FileWriter("/Users/gheorgheaurelpacurar/Desktop/javaprocess/MultithreadingFile.txt");
            fw.append("TEST THREAD ------------------------------------------------------\n");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        // create two paralel threads a and s and start them
        Adunare a = new Adunare(fw, c);
        a.start();
        Scadere s = new Scadere(fw, c);
        s.start();
        // Print value of contror in the third paralel thread
        for(int i=0;i<500;i++){
            System.out.println("La citirea "+ i + " Contorul are valoarea:" + c.value());
            writeCounterInFile(i, "/Users/gheorgheaurelpacurar/Desktop/javaprocess/MultithreadingFile.txt");
        }
    }
    
    synchronized private static void writeCounterInFile(int count, String filePath){
        try {
            fw.append("TEST THREAD - La citirea "+ count + " Contorul are valoarea:" + c.value() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}