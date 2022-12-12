package org.example;

public class Main {

    public static void main(String[] args){
        User user = User.builder().name("Vitalik").age(18).gender(Gender.MALE).occupation("student").weight(75).height(175).build();
        System.out.println(user);
    }
//    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
//        MailjetClient client;
//        MailjetRequest request;
//        MailjetResponse response;
//        client = new MailjetClient(API_KEY, API_SECRET, new ClientOptions("v3.1"));
//        request = new MailjetRequest(Emailv31.resource)
//                .property(Emailv31.MESSAGES, new JSONArray()
//                        .put(new JSONObject()
//                                .put(Emailv31.Message.FROM, new JSONObject()
//                                        .put("Email", "dobosevych@ucu.edu.ua")
//                                        .put("Name", "Oles"))
//                                .put(Emailv31.Message.TO, new JSONArray()
//                                        .put(new JSONObject()
//                                                .put("Email", "dobosevych@ucu.edu.ua")
//                                                .put("Name", "Oles")))
//                                .put(Emailv31.Message.SUBJECT, "Greetings from Mailjet.")
//                                .put(Emailv31.Message.TEXTPART, "My first Mailjet email")
//                                .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger 1, welcome to <a href='https://www.mailjet.com/'>Mailjet</a>!</h3><br />May the delivery force be with you!")
//                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
//        response = client.post(request);
//        System.out.println(response.getStatus());
//        System.out.println(response.getData());
//    }
}