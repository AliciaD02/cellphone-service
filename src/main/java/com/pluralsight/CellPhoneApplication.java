package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    // scanner to get info from user
    public static Scanner theScanner= new Scanner(System.in);
    public static void main(String[] args) {

        // create the phone
        CellPhone thePhone = new CellPhone();

        // start gathering information for the phone
        System.out.println("what is the serial number? ");

        //start the serial from the user
        int serialNumber = theScanner.nextInt();

        // add the serialNumber to the actual phone
        // this is using the phone set method
        thePhone.setSerialNumber(serialNumber);

        //eat the newline since switching from numbers to text
        theScanner.nextLine();

        System.out.println("What model is this phone? ");
        String model = theScanner.nextLine();

        // after this you have to add the model to the phone

        thePhone.setModel(model);

        System.out.println("Who is the carrier?");
        String carrier = theScanner.nextLine();

        thePhone.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = theScanner.nextLine();

        thePhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of this phone? ");
        String owner = theScanner.nextLine();
        thePhone.setOwner(owner);

        System.out.println(thePhone.toString());

    }


}

