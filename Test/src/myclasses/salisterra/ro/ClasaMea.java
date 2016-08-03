/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses.salisterra.ro;

public class ClasaMea {
	public static void main (String[] args) {
                // create an instance of MyClass
                MyClass obiectSauInstanta = new MyClass("cucubaw este doar un sir");
                MyClass altobiect = new MyClass("alt sir Nata ;)");
                MyClass altreileaobiect = new MyClass("deja e stresant nu?");
                
                System.out.println(obiectSauInstanta.myString);
                System.out.println(obiectSauInstanta.getCounter());
                
                MyClass.cucu = 10.0;
                System.out.println(MyClass.cucu);
                
                Creion c = new Creion();
                c.producator = "Herliz";
                System.out.println(c.producator);
        }
}