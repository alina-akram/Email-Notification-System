package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;
import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  public static void main(String[] args) {
    //Abstract Factory

    VIPCustomerFactory vipF = new VIPCustomerFactory(); //inst
    Email email1 = vipF.createEmail("Alina", "12345@gmail.com"); //creates email1
    System.out.println(email1.printEmail());
  }



}
