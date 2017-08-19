package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //create an EmailNotification and a TextNotification object
        EmailNotification email = new EmailNotification("weather","hey iam loving this weather", "Will", "Gmail");
        TextNotification text =  new TextNotification("love", "how is your relationship going?", "Tammy", "Tmobile");

        // call the transport() method.
        email.transport();
        text.transport();


        // Add a call to the method for EmailNotification and TextNotification in the main() method of Main.
        email.setStatus("awesome");

        // In main call the method on the instance of EmailNotification
        email.printText();


        try {
            Object emailNotificationClone = email.clone();
            System.out.println(emailNotificationClone.equals(email));
        } catch (CloneNotSupportedException ex) {
            System.out.println("no");
            ex.printStackTrace();
        }




    }
}
