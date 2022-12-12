package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MailInfo {
    @Getter
    private Client client;
    @Getter
    private MailCode mailCode;

    public String generate(){
        return mailCode.generate(client);
    }

}
