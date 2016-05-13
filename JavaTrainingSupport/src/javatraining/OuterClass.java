/*
 * copyright a-sti.ro
 */
package javatraining;
/**
 *
 * @author gheorgheaurelpacurar
 */
public class OuterClass {
    int a;
    static double d;
    static class StaticNestedClass {
        int b;
        static double c;
        public double getC(){
            return c;
        }
        public int getB(){ return b;}
    }
    class InnerClass {
        int e;
        double f;
        public double getF(){ 
            return f;
        }
    }
} // end OuterClass
