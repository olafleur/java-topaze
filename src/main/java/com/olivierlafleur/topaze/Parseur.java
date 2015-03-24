package com.olivierlafleur.topaze;

import org.antlr.v4.runtime.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Parseur {
    public EtatMachine parseInstruction(EtatMachine etatMachine, String instruction) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(instruction.getBytes());

        TopazeLexer lexer = new TopazeLexer(new ANTLRInputStream(inputStream));
        TopazeParser parser = new TopazeParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parseInstruction at line " + line + " due to " + msg, e);
            }
        });

        TopazeBaseVisitorVariable topazeBaseVisitorVariable = new TopazeBaseVisitorVariable();

        etatMachine.ajouterVariable(topazeBaseVisitorVariable.visitInitialisation(parser.initialisation()));

        return etatMachine;
    }
}
