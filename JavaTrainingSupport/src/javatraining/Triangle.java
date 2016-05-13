/*
 * copyright a-sti.ro
 */
package javatraining;

/**
 * Triangle class as subclass of Shape
 * @author gheorgheaurelpacurar
 */
public class Triangle extends Shape{
        //partial definition of a line
    private final String definition = " having three edges, defined by three different points located in the same plan";
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
