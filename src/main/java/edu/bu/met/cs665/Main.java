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
    //Abstract Factory

    VIPCustomerFactory vipF = new VIPCustomerFactory(); //inst
    Email email1 = vipF.createEmail("Alina", "alina@gmail.com"); //creates email1
    System.out.println(email1.printEmail());

    ReturningCustomerFactory returningF = new ReturningCustomerFactory(); //inst
    Email email2 = returningF.createEmail("Lesley", "lesley@gmail.com"); //creates email1
    System.out.println(email2.printEmail());

    NewCustomerFactory newF = new NewCustomerFactory(); //inst
    Email email3 = newF.createEmail("Tahsin", "tahsin@gmail.com"); //creates email1
    System.out.println(email3.printEmail());

    BusinessCustomerFactory businessF = new BusinessCustomerFactory(); //inst
    Email email4 = businessF.createEmail("Maeve", "maeve@gmail.com"); //creates email1
    System.out.println(email4.printEmail());


  }


}
