package com.company.solid.liskovSubstitutionPrinciple.exemploCorreto;

public class Carro extends VeiculosComMotor {
    @Override
    public String locomover() {
        return "Carro se movendo...";
    }
}
