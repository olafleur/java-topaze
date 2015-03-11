package com.olivierlafleur.topaze.instructions;

public class InstructionInitialisation implements Instruction {
    private String nom;
    private Object Valeur;

    @Override
    public String print() {
        return "";
    }

    public String getNom() {
        return "x";
    }

    public Object getValeur() {
        return 3;
    }
}
