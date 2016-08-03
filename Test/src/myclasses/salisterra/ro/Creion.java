/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses.salisterra.ro;

import com.sun.prism.paint.Color;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Creion {
    
    //atribute sau variabile ale clasei
    public String producator;
    Color culoare;
    enum TipCreion { mecanic, normal };
    TipCreion tipCreion;
    Boolean guma;
    Boolean mina;
    //Stare - (Pelikan, negru, mecanic)
    
    // metode ale clasei
    // constructor method
    
    // alte metode
    public void incarcaMina(){
        mina = true;
    }
    // 
    public void schimbaGuma(){
        guma = true;
    }
    // 
    public void scrie(){
        mina = false;
    }
    //
    public void sterge(){
        guma = false;
    }
    
    // Behavior - totalitatea metodelor publice
}
