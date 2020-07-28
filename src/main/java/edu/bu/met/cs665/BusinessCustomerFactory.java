/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #3
 * July 27, 2020
 */


package edu.bu.met.cs665;

public class BusinessCustomerFactory implements EmailFactory {
    @Override
    public Email createEmail(String name, String address) {
        //creates the email
        BusinessCustomerEmail email; //declared var
        String subject = "Welcome Business Customer.....";
        String body = "Hello " + name + ",\n Thanks for being a Business customer...\n";

        email = new BusinessCustomerEmail(address, body, subject);
        return email;

    }
}
