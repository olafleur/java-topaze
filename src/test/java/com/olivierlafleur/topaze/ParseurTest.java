package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

public class ParseurTest {
    @Test
    public void testLectureFichierSimple() throws IOException {
        Parseur parseur = new Parseur();

        parseur.parse("/test.tpz");

        //TODO : Valider valeur stockée
    }
}
