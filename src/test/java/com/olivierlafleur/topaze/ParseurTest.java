package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ParseurTest {
    @Test
    public void testParseInstructionInitialisation() throws IOException {
        Parseur parseur = new Parseur();

        parseur.parseInstruction(new EtatMachine(), "x vaut 3.");
    }

    @Test
    public void testAjoutEntierMachine() {
        EtatMachine etatMachine = new EtatMachine();

        etatMachine.ajouterVariable(new Variable("x", 3));

        assertEquals(3, etatMachine.getValeur("x"));
    }

    @Test
    public void testAjouterAutreEntierMachine() {
        EtatMachine etatMachine = new EtatMachine();

        etatMachine.ajouterVariable(new Variable("xy", 5));

        assertEquals(5, etatMachine.getValeur("xy"));
    }

    @Test
    public void testParseVariable_machineModifiee() throws IOException {
        Parseur parseur = new Parseur();

        EtatMachine etatMachine = parseur.parseInstruction(new EtatMachine(), "x vaut 3.");

        assertEquals(3, etatMachine.getValeur("x"));
    }

}
