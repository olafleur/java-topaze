package com.olivierlafleur.topaze;

import java.util.ArrayList;

public class EtatMachine {
    private ArrayList<Variable> variables;

    public EtatMachine() {
        variables = new ArrayList<>();
    }

    public void ajouterVariable(Variable variable) {
        variables.add(variable);
    }

    public int getValeur(String nom) {
        return variables.stream()
                .filter(v -> v.getName().equals(nom))
                .findAny()
                .get()
                .getValeur();
    }
}
