package org.example.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
public class MailBox {
    private static final MailSender mailSender = new MailSender();
    private final List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }


    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailInfo info: infos){
            mailSender.sendMail(info);
        }
    }


}
