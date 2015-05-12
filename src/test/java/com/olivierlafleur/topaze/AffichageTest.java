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

    @Test
    public void testParseStringAvecEspaces() throws IOException {
        Parseur parseur = new Parseur();

        parseur.executerInstruction(new EtatMachine(), "afficher \"bonjour toi\".");
    }

    @Test
    public void testAfficherContenuVariable() throws IOException {
        Parseur parseur = new Parseur();

        EtatMachine etatMachine = new EtatMachine();

        parseur.executerInstruction(etatMachine, "x vaut 3.");
        parseur.executerInstruction(etatMachine, "afficher x.");

        verify(etatMachine).ecrire("3");
    }
}
