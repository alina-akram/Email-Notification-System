/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #3
 * July 27, 2020
 */


package edu.bu.met.cs665;

public class ReturningCustomerFactory implements EmailFactory {
    @Override
    public Email createEmail(String name, String address) {
        //creates the email
        ReturningCustomerEmail email; //declared var
        String subject = "Welcome Returning Customer.....";
        String body = "Hello " + name + ",\n Thanks for being a Returning customer...\n";

        email = new ReturningCustomerEmail(address, body, subject);
        return email;
    }
    //implements email factory interface


}
