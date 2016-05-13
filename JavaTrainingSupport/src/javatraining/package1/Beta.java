/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining.package1;

/**
 * Class Beta in the same package with Alpha
 * @author gheorgheaurelpacurar
 */
public class Beta {
    
    public int publicBeta = 18;
    protected int protectedBeta = 20;
    private int privateBeta = 22;
    int packageBeta = 16;
    
     /**
     Constructor succeeds to access all members in the class. 
     * Access Modifiers are not acting for class members but for 
     * other classes members, in the same or in other package.
     */
    public void Beta(){
            publicBeta = 0;
            protectedBeta = 0;
            privateBeta = 0;
            packageBeta = 0;
    }    
    /**
     Methods try to access members from class Alpha located in the same package
     */
    private void testAccess(){
        // create a new instance of class Alpha
        Alpha newObject = new Alpha();

        newObject.publicAlpha = 100;
        newObject.protectedAlpha = 100;
        //newObject.privateAlpha = 100; 
        // in the same package private members are not visible/accessible to
        // members of classes in the same package!
        newObject.packageAlpha=100;
    } 
}