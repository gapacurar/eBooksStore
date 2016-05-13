/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining.package2;

import javatraining.package1.Alpha;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Gamma {
    public int publicGamma = 34;
    protected int protectedGamma = 36;
    private int privateGamma = 38;
    int packageGamma = 40;
    
    /**
     Constructor succeeds to access all members in the class. 
     * Access Modifiers are not acting for class members but for 
     * other classes members, in the same or in other package.
     */
    public void accessLocalMembers(){
            publicGamma = 0;
            protectedGamma = 0;
            privateGamma = 0;
            packageGamma = 0;
    }
    /**
     Methods try to access members from class Alpha located in the same package
     */
    private void testAccess(){
        // create a new instance of class Alpha
        Alpha newObject = new Alpha();

        newObject.publicAlpha = 100;
        // newObject.protectedAlpha = 100;
        // newObject.privateAlpha = 100; 
        // in the same package private members are not visible/accessible to
        // members of classes in the same package!
        // package members are visible only in the same package and import
        // is not changing this rule
        // newObject.packageAlpha=100;
    }     
}
