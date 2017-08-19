package com.company;

/**
 * Created by Admin on 8/18/17.
 */
public class EmailNotification extends Notification implements Cloneable {


    // instance variables
    private String recipient;
    private String smtpProvider;




    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

    }





    // gettters
    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }





    // setters
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSmtpProvider(String smtpProvider) {
        this.smtpProvider = smtpProvider;
    }

    public void setStatus(String status){
        this.status = status;
    }


//    @Override
//    public void showStatus() {
//        super.showStatus();
//    }


    //methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (!getRecipient().equals(that.getRecipient())) return false;
        return getSmtpProvider().equals(that.getSmtpProvider());
    }

    @Override
    public int hashCode() {
        int result = getRecipient().hashCode();
        result = 31 * result + getSmtpProvider().hashCode();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (EmailNotification)super.clone();
    }

    @Override
    public void printText() {
        super.printText();
        System.out.println("additional text to see");
    }

    @Override
    public void transport() {
        System.out.println(getRecipient() + " " + getSmtpProvider() + " " + getCreatedAt() + " " + getBody() + " " + getSubject());
    }
}
