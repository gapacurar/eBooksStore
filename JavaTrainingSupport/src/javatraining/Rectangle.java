/*
 * copyright a-sti.ro
 */
package javatraining;

/**
 * Rectangle is subclass of superclass Shape
 * @author gheorgheaurelpacurar
 */
public class Rectangle extends Shape{
        //partial definition of a line
    private final String definition = ", having 4 edges and 4 right angles";
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
