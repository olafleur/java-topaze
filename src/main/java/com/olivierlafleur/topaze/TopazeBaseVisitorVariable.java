package com.olivierlafleur.topaze;

import org.antlr.v4.runtime.misc.NotNull;

public class TopazeBaseVisitorVariable extends TopazeBaseVisitor<Variable> {
    @Override
    public Variable visitInitialisation(@NotNull TopazeParser.InitialisationContext ctx) {
        return new Variable(ctx.nom.getText(), Integer.valueOf(ctx.valeur.getText()));
    }
}
