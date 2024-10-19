package com.company.solid.singleresp.exemploCorreto;

public class UserEmailService {

    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to: " + user.getEmail());
    }
}
