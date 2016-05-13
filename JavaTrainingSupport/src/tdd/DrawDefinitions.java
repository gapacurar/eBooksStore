/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.util.LinkedList;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class DrawDefinitions {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
    // create a list of figures
    
    LinkedList draw = new LinkedList();
    // create two rectangles
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();
    // add figures to list
    draw.add(r1);
    draw.add(r2);
    // print definitions of all figures in the list
    for(int currentFigure = 0;currentFigure < draw.size(); currentFigure++){
        GeometricalFigure gf = (GeometricalFigure)draw.get(currentFigure);
        System.out.println(gf.getDefinition());
    }
    }
    
}
