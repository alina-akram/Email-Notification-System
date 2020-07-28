/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #3
 * July 27, 2020
 */
package edu.bu.met.cs665;

public abstract class Email {
    //Abstract Class that other customer classes inherit from
    protected String customerEmail;
    protected String emailBody;
    protected String emailSubject;

    public Email(String cEmail,String eBody, String eSubject){
        //constructor
        customerEmail = cEmail;
        emailBody = eBody;
        emailSubject = eSubject;
    }

    public String printEmail() {
        return "to:" + customerEmail + "\nsubject:" + emailSubject + "\nbody: " + emailBody;
    }
}
