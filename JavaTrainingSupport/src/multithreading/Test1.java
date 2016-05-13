/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class Test1 {
    static FileWriter fw;
    static CounterDouble cd;

    
    public static void main(String[] args){

        // create a new counter
        cd = new CounterDouble();
        try {
            fw = new FileWriter("/Users/gheorgheaurelpacurar/Desktop/javaprocess/MultithreadingFile.txt");
            fw.append("TEST1 THREAD ------------------------------------------------------\n");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }        
        // create two paralel threads to use a double counter
        Adunare ad = new Adunare(fw, cd);
        ad.start();
        Scadere sd = new Scadere(fw, cd);
        sd.start();
        // Print value of contror in the third paralel thread
        for(int i=0;i<500;i++){
            System.out.println("La citirea "+ i + " Contorul Double are valoarea:" + cd.value());
            writeCounterInFile(i, "/Users/gheorgheaurelpacurar/Desktop/javaprocess/MultithreadingFile.txt");
        }
    }
    
    synchronized private static void writeCounterInFile(int count, String filePath){
        try {
            fw.append("TEST1 THREAD - La citirea "+ count + " Contorul double are valoarea:" + cd.value() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
