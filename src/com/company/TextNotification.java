package com.company;

/**
 * Created by Admin on 8/19/17.
 */
public class TextNotification extends Notification {

    // instance variables
    private String recipient;
    private String smsProvider;


    // constructor
    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printText();
    }





    // getters
    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }





    // setter
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSmsProvider(String smsProvider) {
        this.smsProvider = smsProvider;
    }





    // methods
    @Override
    public void transport() {
        System.out.println(getRecipient() + " " + getSmsProvider() +  " " + getCreatedAt() + " " + getBody() + " " + getSubject());
    }
}
