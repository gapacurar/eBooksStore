/*
 * copyright a-sti.ro
 */
package javatraining.package2;
import javatraining.package1.Alpha;
/**
 * Class is subclass of Alpha Class from package1. The import is necessary.
 * Also Alpha should be public in package1.
 * @author gheorgheaurelpacurar
 */
public class SubAlpha extends Alpha{
    public int publicSubAlpha = 26;
    protected int protectedSubAlpha = 28;
    private int privateSubAlpha = 30;
    int packageSubAlpha = 32;
    
     /**
     SubAlpha constructor succeeds to access all members in the class. 
     * Access Modifiers are not acting for class members but for 
     * other classes members, in the same or in other package.
     */
    public void SubAlpha(){
            publicSubAlpha = 0;
            protectedSubAlpha = 0;
            privateSubAlpha = 0;
            packageSubAlpha = 0;
    }
    /**
     Methods try to access members from class Alpha located in the same package
     */
    private void testAccess(){
        // create a new instance of class Alpha
        Alpha newObject = new Alpha();

        // public is visible and accessible everywhere
        newObject.publicAlpha = 100;
        //SUN/Oracle inheritage anomaly! Even a member of a superclass in other package
        // is protected, and should be visible in subclass members, it is not like
        // that
        //newObject.protectedAlpha = 100;
        //newObject.privateAlpha = 100; 
        // in the same package private members are not visible/accessible to
        // members of classes in the same package!
        // package members are not visible out of package of their class
        //newObject.packageAlpha=100;
    } 
}
