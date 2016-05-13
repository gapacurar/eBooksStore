/*
 * copyright a-sti.ro
 */
package javatraining;

/**
 * Class Line is subclass of superclass Shape
 * @author gheorgheaurelpacurar
 */
public class Line extends Shape{
    //partial definition of a line
    private final String definition = ", geomethical place of all all points between two predefined points.";
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
