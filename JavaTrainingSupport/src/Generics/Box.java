/*
 * copyright a-sti.ro
 */
package Generics;

/**
 * @author gheorgheaurelpacurar
 * Generic class, generic method 
 * @param <T> generic type
 */
public class Box<T> {
    /** 
     private field t having generic type T
     */
    private T t;          
    /**
     set-er for t private filed of Box class
     * @param t paramater
     */
    public void set(T t) {
        this.t = t;
    }
    /**
     get-er returns value of private filed t by =generic type T.
     * @return t
     */
    public T get() {
        return t;
    }
    /**
     Method prints the name of concrete types in run-time of generic types
     * U and T
     * @param <U> u generic type
     * @param u 
     */
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}
