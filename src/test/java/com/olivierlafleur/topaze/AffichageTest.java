package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AffichageTest {
    @Test
    public void testParseInstructionAffichage() throws IOException {
        Parseur parseur = new Parseur();

        parseur.executerInstruction(new EtatMachine(), "afficher \"bonjour\".");
    }

    @Test
    public void testAppelleAffichage() throws IOException {
        Parseur parseur = new Parseur();

        EtatMachine etatMachine = mock(EtatMachine.class);

        parseur.executerInstruction(etatMachine, "afficher \"bonjour\".");

        verify(etatMachine).ecrire("bonjour");
    }
}
