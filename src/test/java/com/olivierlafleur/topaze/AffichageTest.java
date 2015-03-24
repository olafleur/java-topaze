package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

public class AffichageTest {
    @Test
    public void testParseInstructionAffichage() throws IOException {
        Parseur parseur = new Parseur();

        parseur.parseInstruction(new EtatMachine(), "afficher \"bonjour\".");
    }
}
