package com.company.solid.liskovSubstitutionPrinciple.exemploIncorreto;

public class Penguin extends Bird {
    void walk() {
        System.out.println("Penguins walk");
    }

    @Override
    public void fly() {
        System.out.println("Penguins can't fly");
    }
}