package com.olivierlafleur.topaze;

import org.antlr.v4.runtime.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Parseur {
    public void parseInstruction(String instruction) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(instruction.getBytes());

        TopazeLexer l = new TopazeLexer(new ANTLRInputStream(inputStream));
        TopazeParser p = new TopazeParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parseInstruction at line " + line + " due to " + msg, e);
            }
        });
        p.topaze();
    }
}
