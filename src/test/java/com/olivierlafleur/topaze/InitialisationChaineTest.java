package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

public class InitialisationChaineTest {
    @Test
    public void testParseInitialisationChaine() throws IOException {
        Parseur parseur = new Parseur();

        parseur.executerInstruction(new EtatMachine(), "nom vaut \"Olivier Lafleur\".");
    }
}
