package com.company.solid.liskovSubstitutionPrinciple.exemploCorreto;

public class VeiculosComMotor implements Veiculo {
    @Override
    public String locomover() {
        return "Ligando Motor";
    }
}
