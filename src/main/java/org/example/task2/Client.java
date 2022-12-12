package org.example.task2;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter
    private int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Gender sex;
    @Getter @Setter
    private String mail;

    private static int counter = 1;

    public Client(String name, int age, Gender sex, String mail){
        id = counter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }
}
