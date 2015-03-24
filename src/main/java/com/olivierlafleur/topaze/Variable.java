package com.olivierlafleur.topaze;

public class Variable {
    private String name;
    private int valeur;

    public Variable(String name, int valeur) {
        this.name = name;
        this.valeur = valeur;
    }

    public String getName() {
        return name;
    }

    public int getValeur() {
        return valeur;
    }
}
