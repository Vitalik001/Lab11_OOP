package org.example.task2;

public class GiftMail implements MailCode{

    private static String TEMPLATE = "Congratulations! %NAME, it is your birthday today! Receive your gift!";
    public String generate(Client client){
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
