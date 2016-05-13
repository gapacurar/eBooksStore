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
public class Producer extends Thread{
    
    FileWriter fw;
    WorkingBuffer wb;
        
    @Override
    public void run(){
        for (int i=0;i<500;i++){
            try {
                wb.put("PRODUCER loaded in step "+i+" this string in buffer.");
                fw.append("PRODUCER loaded in step "+i+" this string in buffer.\n");
            } catch (IOException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Producer(WorkingBuffer wb, FileWriter fw){
        this.wb = wb;
        this.fw = fw;
    }
}
