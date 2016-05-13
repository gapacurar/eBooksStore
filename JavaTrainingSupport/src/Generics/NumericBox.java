/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author gheorgheaurelpacurar
 * @param <T> generic bounded type meaning a subclass of Number class
 */
public class NumericBox <T extends Number>{
    // local variable t by generic type T
    private T t;
    // setter
    public void set(T t) {
        this.t = t;
    }
    // getter
    public T get() {
        return t;
    }
}
