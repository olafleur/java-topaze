package com.olivierlafleur.topaze;

public class AfficheurConsole implements Afficheur {
    @Override
    public void ecrire(String message) {
        System.out.println(message);
    }
}
