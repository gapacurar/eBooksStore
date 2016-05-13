/*
 * copyright a-sti.ro
 */
package Generics;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class TestGenerics {
    
    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        // create three keys as Integers
        Integer key1 = 10;
        Integer key2 = 20;
        Integer key3 = 30;
        Integer key4 = 40;
        // create three values as Strings
        String value1 = "Value 1";
        String value2 = "Value 1";
        String value3 = "Value 1";
        // Declare, instantiate and initialized three OrderedPair objects
        OrderedPair<Integer, String> orderedPair1, orderedPair2, orderedPair3;
        orderedPair1 = new OrderedPair<>(key1,value1);
        orderedPair2 = new OrderedPair<>(key2,value2);
        orderedPair3 = new OrderedPair<>(key3,value3);
        // print values of all three objects
        System.out.println("OrderedPair1("+orderedPair1.getKey()+","+orderedPair1.getValue()+")");
        System.out.println("OrderedPair2("+orderedPair2.getKey()+","+orderedPair2.getValue()+")");
        System.out.println("OrderedPair3("+orderedPair3.getKey()+","+orderedPair3.getValue()+")");
        // Create a new Box instance
        // create a Box for Integers
        Box<Integer> integerBox = new Box<>();
        // set value of Integer field t to 10
        integerBox.set(80);
        OrderedPair<Integer, Box<Integer>> interestingPair;
        interestingPair = new OrderedPair<>(key4, integerBox);
        System.out.println("InterestingPair("+interestingPair.getKey()+","+interestingPair.getValue()+")");
        System.out.println("InterestingPair("+interestingPair.getKey()+","+interestingPair.getValue().get()+")");
        // using raw type 
        Box rawBox = integerBox;
        System.out.println("Raw Box ("+ rawBox.get()+")");
        // call a generyc type method
        PairClass<Integer, String> p1 = new PairClass<>(1, "apple");
        PairClass<Integer, String> p2 = new PairClass<>(2, "pear");
        PairClass<Integer, String> p3 = new PairClass<>(1, "apple");
        boolean same;
        same = Util.<Integer, String>compare(p1, p2);
        System.out.println("("+p1.getKey()+","+p1.getValue()+") is equal with ("+p2.getKey()+","+p2.getValue()+") is "+same);
        same = Util.<Integer, String>compare(p1, p3);
        System.out.println("("+p1.getKey()+","+p1.getValue()+") is equal with ("+p3.getKey()+","+p3.getValue()+") is "+same);
        // create an instance of NumericBox as a bounded generic type
        NumericBox<Integer> numericBox;
        numericBox = new NumericBox<>();
        numericBox.set(110);
        // try to use a String to create a NumericBox will return an error because is not bounded to Numeric
        //NumericBox<String> numericBox;
    }
}
