package com.olivierlafleur.topaze;

import java.util.HashMap;

public class EtatMachine {
    private HashMap<String, Integer> variables;

    public EtatMachine() {
        variables = new HashMap<String, Integer>();
    }

    public void ajouterEntier(String nom, int valeur) {
        variables.put(nom, valeur);
    }

    public int getValeur(String x) {
        return variables.get(x);
    }
}
