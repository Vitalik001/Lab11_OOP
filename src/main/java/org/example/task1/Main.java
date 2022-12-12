package org.example.task1;

public class Main {
    public static void main(String[] args)  {
        User user = User.builder().name("Vitalik").age(18).gender(Gender.MALE).occupation("student").build();
        System.out.println(user);
    }
}
