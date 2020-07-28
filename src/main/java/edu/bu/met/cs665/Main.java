/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #3
 * July 27, 2020
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;
import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  public static void main(String[] args) {
    //Executes the createEmail() method for each type of customer

    VIPCustomerFactory vipF = new VIPCustomerFactory();
    Email email1 = vipF.createEmail("Alina", "alina@gmail.com");
    System.out.println(email1.printEmail());

    ReturningCustomerFactory returningF = new ReturningCustomerFactory();
    Email email2 = returningF.createEmail("Lesley", "lesley@gmail.com");
    System.out.println(email2.printEmail());

    NewCustomerFactory newF = new NewCustomerFactory();
    Email email3 = newF.createEmail("Tahsin", "tahsin@gmail.com");
    System.out.println(email3.printEmail());

    BusinessCustomerFactory businessF = new BusinessCustomerFactory();
    Email email4 = businessF.createEmail("Maeve", "maeve@gmail.com");
    System.out.println(email4.printEmail());

  }
}
