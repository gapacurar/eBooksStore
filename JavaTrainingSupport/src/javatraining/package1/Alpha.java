/*
 * copyright a-sti.ro
 */
package javatraining.package1;

/**
 * Class Alpha should be public in package1 if a class form another package, SubAlpha
 * wants to inherit it!
 * Be carefully that a class can be only public or package.
 * @author gheorgheaurelpacurar
 */
public class Alpha {
    public int publicAlpha = 10;
    protected int protectedAlpha = 12;
    private int privateAlpha = 14;
    int packageAlpha = 16;
    
     /**
     Constructor succeeds to access all members in the class. 
     * Access Modifiers are not acting for class members but for 
     * other classes members, in the same or in other package.
     */
    public void Alpha(){
            publicAlpha = 0;
            protectedAlpha = 0;
            privateAlpha = 0;
            packageAlpha = 0;
    }
}
