package com.olivierlafleur.topaze;

import com.olivierlafleur.topaze.instructions.Instruction;
import com.olivierlafleur.topaze.instructions.InstructionInitialisation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParseurTest {
    @Test
    public void testParserInitialisation() {
        Parseur parseur = new Parseur();

        Instruction instruction = parseur.parse("x vaut 3.");

        assertTrue(instruction instanceof InstructionInitialisation);

        InstructionInitialisation instructionInitialisation = (InstructionInitialisation) instruction;

        assertEquals(3, instructionInitialisation.getValeur());
        assertEquals("x", instructionInitialisation.getNom());
    }
}
