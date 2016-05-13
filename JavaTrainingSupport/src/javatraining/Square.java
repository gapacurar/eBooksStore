/*
 * copyright a-sti.ro
 */
package javatraining;

/**
 * class Square as subclass of Rectangle 
 * @author gheorgheaurelpacurar
 */
public class Square extends Rectangle{
        //partial definition of a line
    private final String definition = ", all 4 edges being equal.";
    /** method returns definition of line as String.
     * @return String definition
     * method has the same name as the name of method in the superclass Shape.
     * This is a polymorphic form of Shape realized through inheritance 
     * and overriding. 
    */
    @Override
    public String getDefinition(){
        String parentDefinition = super.getDefinition();
        String returnedDefinition = parentDefinition.concat(definition);
        return returnedDefinition;
    }
}
