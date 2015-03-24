package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ParseurTest {
    @Test
    public void testParseInstructionInitialisation() throws IOException {
        Parseur parseur = new Parseur();

        parseur.parseInstruction("x vaut 3.");
    }

    @Test
    public void testAjoutEntierMachine() {
        EtatMachine etatMachine = new EtatMachine();

        etatMachine.ajouterEntier("x", 3);

        assertEquals(3, etatMachine.getValeur("x"));
    }

    @Test
    public void testAjouterAutreEntierMachine() {
        EtatMachine etatMachine = new EtatMachine();

        etatMachine.ajouterEntier("xy", 5);

        assertEquals(5, etatMachine.getValeur("xy"));
    }

}
