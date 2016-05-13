/*
 * Copyright a-sti.ro
 */
package javatraining;
/**
 * @author gheorgheaurelpacurar
 */
public class Car implements Saleable, Rentable{
    /**
     @enum enumeration of accepted car colors
     */
    public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
    /**
     Internal hidden fields / attributes
     */
    private Color color;
    private String name;
    private short speed;
    /**
     Constructors
     */
    public void Car(){
        name = "Default car name";
        speed = 90;
        color = Color.BLACK;
    }
    public void Car(String carName, short carSpeed, Color carColor){
        name = carName;
        speed = carSpeed;
        color = carColor;
    }
    /*get-ers and set-ers*/
    public String getName(){
        return(name);
    }
    public Color getColor(){
        return(color);
    }
    public short getSpeed(){
        return(speed);
    }
    public void setName(String newName){
        name = newName;
    }
    public void setColor(Color newColor){
        color = newColor;
    }
    public void setSpeed(short newSpeed){
        speed = newSpeed;
    }
    /**
     The method increase actual speed of Car until final speed specified.
     * Method tests if specified speed is higher than actual speed before to 
     * increase it.
     * @param newSpeed is new speed 
     */
    public void increaseSpeed(short newSpeed){
        if(newSpeed > speed){
            speed = newSpeed;
        }
        else if (newSpeed < speed){
            decreaseSpeed(newSpeed);
        }
    }
    /**
     The method decrease actual speed of Car until final speed specified.
     * Method tests if specified speed is higher than actual speed before to 
     * increase it.
     * @param newSpeed is new speed 
     */
    public void decreaseSpeed(short newSpeed){
        if(newSpeed < speed){
            speed = newSpeed;
        }
        else if (newSpeed < speed){
            increaseSpeed(newSpeed);
        }
    }
    /**
     Abstract method defined in Saleable interface implemented by class car
     * is implemented here.
     * @override Saleable.getSalePrice() method
     * 
     */
    @Override
    public int getSalePrice(){
        return(12000);
    }
       /**
     Abstract method defined in Rentable interface implemented by class car
     * is implemented here.
     * @override Rentable.getDailyRentPrice() method
     * 
     */
    @Override
    public int getDailyRentPrice(){
        return(250);
    }
}
