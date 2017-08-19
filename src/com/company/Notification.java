package com.company;

import java.time.LocalDateTime;

/**
 * Created by Admin on 8/18/17.
 */
public class Notification  {

    // instance variables
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "good";




    // constructor
    public Notification(String subject, String body) {
        createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;


    }




    // getters
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }





    // setters
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }






    // methods
    public  void transport(){
        throw new NoTransportException();
    }

    public void showStatus(){
        System.out.println(status);
    }

    // Add a protected method to Notification that prints out some text.
    protected void printText(){
        System.out.println("some text printed");
    }
}
