package com.company.solid.dependencyInversionPrinciple.exemploCorreto;

public class EmailService implements DisparaMensagem{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando email: "+ mensagem);
    }
}
