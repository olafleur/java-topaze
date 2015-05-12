package com.olivierlafleur.topaze;

public class Variable {
    private String name;
    private int valeurEntiere;
    private String valeurChaine;

    public Variable(String name, int valeurEntiere) {
        this.name = name;
        this.valeurEntiere = valeurEntiere;
    }

    public Variable(String name, String valeurChaine) {
        this.name = name;
        this.valeurChaine = valeurChaine;
    }

    public String getName() {
        return name;
    }

    public int getValeurEntiere() {
        return valeurEntiere;
    }

    public String getValeurChaine() {
        return valeurChaine;
    }

    public void setValeurChaine(String valeurChaine) {
        this.valeurChaine = valeurChaine;
    }
}
