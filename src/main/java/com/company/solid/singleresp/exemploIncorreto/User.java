package com.company.solid.singleresp.exemploIncorreto;

//Refatore esse código para que ele siga o princípio da responsabilidade única. Sugestão:
//crie classes ou serviços separados para lidar com a persistência e o envio de e-mails.


public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        System.out.println("Saving user to database...");
    }

    public void sendWelcomeEmail() {
        System.out.println("Sending welcome email to: " + this.email);
    }
}
