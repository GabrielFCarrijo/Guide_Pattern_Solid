package com.company.solid.liskovSubstitutionPrinciple.exemploCorreto;

public abstract class VeiculoSemMotor implements Veiculo {
    @Override
    public String locomover() {
        return "Movendo-se sem motor...";
    }
}
