/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #3
 * July 27, 2020
 */


package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestEmailFactory {
    @Test
    public void TestEmail() {
        //Testing VIP Customer Email
        VIPCustomerFactory vipF = new VIPCustomerFactory(); //inst
        Email email1 = vipF.createEmail("Alina", "12345@gmail.com"); //creates email1
        System.out.println(email1.printEmail());
        assertEquals(VIPCustomerEmail.class ,email1.getClass()); //truth,output
    } //copy paste for other email types.
    @Test
    public void TestFactories() {
        //
        EmailFactory factory; //
//        factory = new ReturningCustomerFactory(); //inst
        factory = new NewCustomerFactory();
        Email email1 = factory.createEmail("Alina", "12345@gmail.com"); //creates email1
        System.out.println(email1.printEmail());
        assertEquals(NewCustomerEmail.class ,email1.getClass()); //truth,output

    }
}
