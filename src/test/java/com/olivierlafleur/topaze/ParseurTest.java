package com.olivierlafleur.topaze;

import com.olivierlafleur.topaze.instructions.Instruction;
import com.olivierlafleur.topaze.instructions.InstructionInitialisation;
import org.antlr.v4.runtime.*;
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

    @Test
    public void testExampleField() throws Exception {
        TopazeLexer l = new TopazeLexer(new ANTLRInputStream(getClass().getResourceAsStream("/test.tpz")));
        TopazeParser p = new TopazeParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });
        p.topaze();
    }
}
