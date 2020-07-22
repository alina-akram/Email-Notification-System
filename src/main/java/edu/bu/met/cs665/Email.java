package edu.bu.met.cs665;

public abstract class Email {
    //AC
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
