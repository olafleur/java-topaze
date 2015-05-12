package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class InitialisationChaineTest {
    @Test
    public void testParseInitialisationChaine() throws IOException {
        Parseur parseur = new Parseur();

        parseur.executerInstruction(new EtatMachine(), "nom vaut \"Olivier Lafleur\".");
    }

    @Test
    public void testAjoutChaineMachine() {
        EtatMachine etatMachine = new EtatMachine();

        etatMachine.ajouterVariable(new Variable("nom", "Olivier Lafleur"));

        assertEquals("Olivier Lafleur", etatMachine.getValeur("nom").getValeurChaine());
    }
}
