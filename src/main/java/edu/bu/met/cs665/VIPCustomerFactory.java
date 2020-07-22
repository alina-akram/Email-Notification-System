package edu.bu.met.cs665;

public class VIPCustomerFactory implements EmailFactory {

    @Override
    public Email createEmail(String name, String address) {
        //creates the email
        VIPCustomerEmail email; //declared var
        String subject = "Welcome VIP.....";
        String body = "Hello " + name + ",\n Thanks for being a VIP customer...";

        email = new VIPCustomerEmail(address, body, subject);
        return email;

    }
}
