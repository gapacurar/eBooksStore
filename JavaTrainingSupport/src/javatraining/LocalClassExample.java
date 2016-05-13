/*
 * copyright a-sti.ro
 */
package javatraining;
/**
 * An example to see what is and how works a local class. A local class is a
 * class defined in a block. A block is a group of zero or more statements 
 * between balanced braces.
 * 
 * @author gheorgheaurelpacurar
 * 
 */
public class LocalClassExample {
    // All symbols that are not digits.
    static String regularExpression = "[^0-9]";
    /**
     * Method validates a phone number as being as: ddd-ddd-dddd where d - digit
     * @param phoneNumber first phone number
     */
    public static void validatePhoneNumber(String phoneNumberToBeValidated) {
        // phone numbers are 10 digits length without - symbols
        final int numberLength = 10;
        // local class
        class PhoneNumber {
            /* formated phone number */
            String formattedPhoneNumber = null;
            // local class constructor 
            PhoneNumber(String phoneNumberToBeValidated){
                // replace everything out of digits with ""
                String currentNumber = phoneNumberToBeValidated.replaceAll(
                  regularExpression, "");
                // chack the number of digits to be equal with 10
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }
            // getter that returns formatedPhoneNumber
            public String getNumber() {
                return formattedPhoneNumber;
            }
        }
        // create new PhoneNumber objects initializing them with the string
        // was received as paramater. Constructor is already processing the 
        // validation. If there is no valid number null is "returned"
        PhoneNumber myNumber = new PhoneNumber(phoneNumberToBeValidated);
        // check the validations and display the results only for successfuly no.
        if (myNumber.getNumber() == null) 
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber.getNumber());
    }// end of method validatePhoneNumber
    // main method
    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890");
        validatePhoneNumber("112 222");
    }
}