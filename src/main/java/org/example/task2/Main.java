package org.example.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class Main {
    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        MailBox mailBox = new MailBox();
        Client client = new Client("Oleg", 19, Gender.MALE, "i.petrychko@ucu.edu.ua");
        MailInfo mailInfo = new MailInfo(client, new GiftMail());
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAll();
    }
}
