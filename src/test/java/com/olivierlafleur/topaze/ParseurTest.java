package com.olivierlafleur.topaze;

import org.junit.Test;

import java.io.IOException;

public class ParseurTest {
    @Test
    public void testParseInstructionInitialisation() throws IOException {
        Parseur parseur = new Parseur();

        parseur.parseInstruction("x vaut 3.");

        //TODO : Valider valeur stockée
    }
}
