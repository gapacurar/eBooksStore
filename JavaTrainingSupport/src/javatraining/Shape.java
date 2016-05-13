/*
 * copyright a-sti.ro
 */
package javatraining;

/**
 *
 * @author gheorgheaurelpacurar
 * Shape class as a superclass
 */
public class Shape {
    // define a static constant
    public final static int SHAPE_ID = 1;
    public static Object cucu = new Object();
    // definition is keeping the text definition
    private final String definition = "A shape";
    // method returns definition
    public String getDefinition(){
        return definition;
    }
}
