package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class InitialisationEntierTest {
    @Test
    public void testParseInstructionInitialisation() throws IOException {
        Parseur parseur = new Parseur();

        parseur.executerInstruction(new EtatMachine(), "x vaut 3.");
    }

    @Test
    public void testAjoutEntierMachine() {
        EtatMachine etatMachine = new EtatMachine();

        etatMachine.ajouterVariable(new Variable("x", 3));

        assertEquals(3, etatMachine.getValeur("x").getValeurEntiere());
    }

    @Test
    public void testAjouterAutreEntierMachine() {
        EtatMachine etatMachine = new EtatMachine();

        etatMachine.ajouterVariable(new Variable("xy", 5));

        assertEquals(5, etatMachine.getValeur("xy").getValeurEntiere());
    }

    @Test
    public void testParseVariable_machineModifiee() throws IOException {
        Parseur parseur = new Parseur();

        EtatMachine etatMachine = parseur.executerInstruction(new EtatMachine(), "x vaut 3.");

        assertEquals(3, etatMachine.getValeur("x").getValeurEntiere());
    }

    @Test(expected = IllegalStateException.class)
    public void testMauvaiseInitialisationCarManquePoint() throws IOException {
        Parseur parseur = new Parseur();

        parseur.executerInstruction(new EtatMachine(), "x vaut 3");
    }

    @Test
    public void testPermetEspacesPartout() throws IOException {
        Parseur parseur = new Parseur();

        EtatMachine etatMachine = parseur.executerInstruction(new EtatMachine(), "x     vaut    3   .    ");

        assertEquals(3, etatMachine.getValeur("x").getValeurEntiere());
    }

    @Test
    public void nomVariablePermetChiffreEtSouligneDedans() throws IOException {
        Parseur parseur = new Parseur();

        parseur.executerInstruction(new EtatMachine(), "a_3 vaut 5.");
    }
}
