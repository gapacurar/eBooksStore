/*
 * 
 */
package myclasses.salisterra.ro;

/**
 *
 * @author gheorgheaurelpacurar
 */
    public class MyClass {

    public MyClass(String myString) {
        this.myString = myString;
    }
    
    public String myString;
    private int counter;
    static public double cucu;

    public double getCucu() {
        return cucu;
    }

    public void setCucu(double cucu) {
        this.cucu = cucu;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
     
}
