package com.olivierlafleur.topaze;

import org.antlr.v4.runtime.*;

import java.io.IOException;

public class Parseur {
    public void parse(String chemin) throws IOException {
        TopazeLexer l = new TopazeLexer(new ANTLRInputStream(getClass().getResourceAsStream(chemin)));
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
