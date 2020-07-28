/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #3
 * July 27, 2020
 */

package edu.bu.met.cs665;

public class VIPCustomerFactory implements EmailFactory {
    //implements EmailFactory

    @Override
    public Email createEmail(String name, String address) {
        //creates the email
        VIPCustomerEmail email; //declared var
        String subject = "Welcome VIP.....";
        String body = "Hello " + name + ",\n Thanks for being a VIP customer...\n";

        email = new VIPCustomerEmail(address, body, subject);
        return email;

    }
}
