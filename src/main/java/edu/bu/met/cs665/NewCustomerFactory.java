/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #3
 * July 27, 2020
 */
package edu.bu.met.cs665;

public class NewCustomerFactory implements EmailFactory {
    //implements EmailFactory
    @Override
    public Email createEmail(String name, String address) {
        //creates the email
        NewCustomerEmail email; //declared var
        String subject = "Welcome New Customer.....";
        String body = "Hello " + name + ",\n Thanks for being a New customer...\n";

        email = new NewCustomerEmail(address, body, subject);
        return email;

    }
}
